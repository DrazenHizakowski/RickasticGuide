package com.dhizak.rickasticguide.domain.interactors.episode;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;
import com.dhizak.rickasticguide.domain.interactors.basic.ObservableUseCaseParameter;
import com.dhizak.rickasticguide.domain.modules.Episode;
import com.dhizak.rickasticguide.domain.repository.EpisodeRepository;

import io.reactivex.Observable;

/**
 * Created by Dražen Hižak on 04/04/2018.
 */

public abstract class GetEpisodeUseCase extends ObservableUseCaseParameter<Integer,Episode> {

    private EpisodeRepository episodeRepository;

    public GetEpisodeUseCase(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor, EpisodeRepository repository) {
        super(observerExecutionThread, executor);
        this.episodeRepository = repository;
    }

    @Override
    public Observable<Episode> buildObservable(Integer parameter) {
        return episodeRepository.getEpisode(parameter);
    }
}
