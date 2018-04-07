package com.dhizak.rickasticguide.domain.interactors.basic;

import io.reactivex.Single;

/**
 * Created by drazenhizak on 24/03/2018.
 */

public abstract class SingleUseCase {

    abstract Single execute();

}
