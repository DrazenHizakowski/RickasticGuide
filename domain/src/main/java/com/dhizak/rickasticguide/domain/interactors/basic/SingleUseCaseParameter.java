package com.dhizak.rickasticguide.domain.interactors.basic;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;

import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by drazenhizak on 24/03/2018.
 */

public abstract class SingleUseCaseParameter<P,T> {

    private ObserverExecutionThread observerExecutionThread;
    private SubscriptionExecutor executor;
    private CompositeDisposable compositeDisposable;

    public SingleUseCaseParameter(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor) {
        this.observerExecutionThread = observerExecutionThread;
        this.executor = executor;
        this.compositeDisposable = new CompositeDisposable();
    }

    public abstract Single<T> buildObservable(P parameter);

    public Single<T> execute(P parameter){
        Single<T> observable = buildObservable(parameter);
        observable.observeOn(observerExecutionThread.getScheduler()).subscribeOn(Schedulers.from(executor));
        compositeDisposable.add(observable.subscribe());
        return observable;
    }

    public void dispose(){
        if(compositeDisposable!=null && !compositeDisposable.isDisposed()){
            compositeDisposable.dispose();
        }
    }
}
