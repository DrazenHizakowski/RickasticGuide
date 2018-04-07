package com.dhizak.rickasticguide.domain.repository;

import com.dhizak.rickasticguide.domain.modules.PlanetaryLocation;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * Created by Dražen Hižak on 24/03/2018.
 */

public interface PlanetaryLocationRepository {

    Single<PlanetaryLocation> getPlanetaryLocation(int id);

    Single<List<PlanetaryLocation>> getPlanetaryLocations(int offset);

    Completable setLocationFavourite(int id);

    Completable unSetLocationFavourite(int id);
}
