package com.dhizak.rickasticguide.domain.repository;

import com.dhizak.rickasticguide.domain.modules.Episode;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;

/**
 * Created by Dražen Hižak on 24/03/2018.
 */

public interface EpisodeRepository {

    Observable<Episode> getEpisode(int id);

    Observable<List<Episode>> getEpisodes(int offset);

    Completable setEpisodeFavourite(int episodeId);
}
