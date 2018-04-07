package com.dhizak.rickasticguide.domain.interactors.basic;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Dražen Hižak on 24/03/2018.
 */
public abstract class ObservableUseCaseParameter<P,T> {

    private ObserverExecutionThread observerExecutionThread;
    private SubscriptionExecutor executor;
    private CompositeDisposable compositeDisposable;

    public ObservableUseCaseParameter(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor) {
        this.observerExecutionThread = observerExecutionThread;
        this.executor = executor;
        this.compositeDisposable = new CompositeDisposable();
    }

    public abstract Observable<T> buildObservable(P parameter);

    public Observable<T> execute(P parameter){
        Observable<T> observable = buildObservable(parameter);
        observable.observeOn(observerExecutionThread.getScheduler()).subscribeOn(Schedulers.from(executor));
        compositeDisposable.add(observable.subscribe());
        return observable;
    }

    public void dispose(){
        if(compositeDisposable!=null && !compositeDisposable.isDisposed()){
            compositeDisposable.clear();
        }
    }
}

