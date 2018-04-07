package com.dhizak.rickasticguide.domain.interactors.episode;

import com.dhizak.rickasticguide.domain.executors.ObserverExecutionThread;
import com.dhizak.rickasticguide.domain.executors.SubscriptionExecutor;
import com.dhizak.rickasticguide.domain.interactors.basic.ObservableUseCaseParameter;
import com.dhizak.rickasticguide.domain.modules.Episode;
import com.dhizak.rickasticguide.domain.repository.EpisodeRepository;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Dražen Hižak on 07/04/2018.
 */

public class GetAllEpisodesUseCase extends ObservableUseCaseParameter<Integer,List<Episode>> {

    private EpisodeRepository repository;

    public GetAllEpisodesUseCase(ObserverExecutionThread observerExecutionThread, SubscriptionExecutor executor,EpisodeRepository episodeRepository) {
        super(observerExecutionThread, executor);
        this.repository = episodeRepository;
    }

    @Override
    public Observable<List<Episode>> buildObservable(Integer parameter) {
        return repository.getEpisodes(parameter);
    }
}
