package com.dhizak.rickasticguide.domain.interactors.location;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;
import com.dhizak.rickasticguide.domain.interactors.basic.SingleUseCaseParameter;
import com.dhizak.rickasticguide.domain.modules.PlanetaryLocation;
import com.dhizak.rickasticguide.domain.repository.PlanetaryLocationRepository;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Dražen Hižak on 07/04/2018.
 */

public class GetAllPlanetaryLocationsUseCase extends SingleUseCaseParameter<Integer,List<PlanetaryLocation>> {

    private PlanetaryLocationRepository repository;

    public GetAllPlanetaryLocationsUseCase(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor, PlanetaryLocationRepository repository) {
        super(observerExecutionThread, executor);
        this.repository = repository;
    }

    @Override
    public Single<List<PlanetaryLocation>> buildObservable(Integer offset) {
        return repository.getPlanetaryLocations(offset);
    }
}
