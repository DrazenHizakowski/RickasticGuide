package com.dhizak.rickasticguide.domain.interactors.characters;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;
import com.dhizak.rickasticguide.domain.interactors.basic.SingleUseCaseParameter;
import com.dhizak.rickasticguide.domain.modules.EpisodeCharacter;
import com.dhizak.rickasticguide.domain.repository.EpisodeCharacterRepository;

import io.reactivex.Single;

/**
 * Created by Dražen Hižak on 25/03/2018.
 */

public class GetEpisodeCharacterUseCase extends SingleUseCaseParameter<Integer,EpisodeCharacter> {

    private EpisodeCharacterRepository repository;

    public GetEpisodeCharacterUseCase(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor, EpisodeCharacterRepository repository) {
        super(observerExecutionThread, executor);
        this.repository = repository;
    }

    @Override
    public Single<EpisodeCharacter> buildObservable(Integer parameter) {
        return repository.getEpisodeCharacter(parameter);
    }

}
