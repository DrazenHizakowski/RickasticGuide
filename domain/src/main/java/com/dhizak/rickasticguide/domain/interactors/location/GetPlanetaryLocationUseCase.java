package com.dhizak.rickasticguide.domain.interactors.location;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;
import com.dhizak.rickasticguide.domain.interactors.basic.SingleUseCaseParameter;
import com.dhizak.rickasticguide.domain.modules.PlanetaryLocation;
import com.dhizak.rickasticguide.domain.repository.PlanetaryLocationRepository;

import io.reactivex.Single;

/**
 * Created by Dražen Hižak on 07/04/2018.
 */

public class GetPlanetaryLocationUseCase extends SingleUseCaseParameter<Integer,PlanetaryLocation> {

    private PlanetaryLocationRepository repository;

    public GetPlanetaryLocationUseCase(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor,PlanetaryLocationRepository repository) {
        super(observerExecutionThread, executor);
        this.repository = repository;
    }

    @Override
    public Single<PlanetaryLocation> buildObservable(Integer parameter) {
        return repository.getPlanetaryLocation(parameter);
    }
}
