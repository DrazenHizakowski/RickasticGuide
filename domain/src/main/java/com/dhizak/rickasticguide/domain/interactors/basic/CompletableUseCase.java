package com.dhizak.rickasticguide.domain.interactors.basic;

import io.reactivex.Completable;

/**
 * Created by drazenhizak on 24/03/2018.
 */

public abstract class CompletableUseCase {

    abstract Completable execute();

}
