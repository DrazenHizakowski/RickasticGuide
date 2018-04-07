package com.dhizak.rickasticguide.domain.executors;

import io.reactivex.Scheduler;

/**
 * Created by Dražen Hižak on 25/03/2018.
 */

public interface ObserverExecutionThread  {

    Scheduler getScheduler();

}
