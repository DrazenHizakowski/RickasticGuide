package com.dhizak.rickasticguide.domain.interactors.characters;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;
import com.dhizak.rickasticguide.domain.interactors.basic.SingleUseCaseParameter;
import com.dhizak.rickasticguide.domain.modules.EpisodeCharacter;
import com.dhizak.rickasticguide.domain.repository.EpisodeCharacterRepository;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Dražen Hižak on 07/04/2018.
 */

public class GetAllCharactersUseCase extends SingleUseCaseParameter<Integer,List<EpisodeCharacter>> {

    private EpisodeCharacterRepository repository;

    public GetAllCharactersUseCase(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor, EpisodeCharacterRepository repository) {
        super(observerExecutionThread, executor);
        this.repository = repository;
    }

    @Override
    public Single<List<EpisodeCharacter>> buildObservable(Integer parameter) {
        return repository.getEpisodeCharacters(parameter);
    }
}
