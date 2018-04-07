package com.dhizak.rickasticguide.domain.repository;

import com.dhizak.rickasticguide.domain.modules.EpisodeCharacter;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * Created by Dražen Hižak on 24/03/2018.
 */

public interface EpisodeCharacterRepository {

    Single<EpisodeCharacter> getEpisodeCharacter(int id);

    Single<List<EpisodeCharacter>> getEpisodeCharacters(int offset);

    Single<List<EpisodeCharacter>> getFavouriteCharacters(int offset);

    Completable setCharacterFavourite(int characterId);

    Completable unSetCharacterFavourite(int characterId);

    void setLimit(int limit);
}
