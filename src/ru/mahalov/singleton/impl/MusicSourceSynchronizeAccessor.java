package ru.mahalov.singleton.impl;

import ru.mahalov.singleton.MusicSourceSingleton;

public class MusicSourceSynchronizeAccessor implements MusicSourceSingleton {
    private static volatile MusicSourceSynchronizeAccessor instance;
    private static final String DESCRIPTION = "Singleton Synchronize Access";

    private MusicSourceSynchronizeAccessor(){}

    public static synchronized MusicSourceSynchronizeAccessor getInstance(){
        if (instance == null) instance = new MusicSourceSynchronizeAccessor();

        return instance;
    }

    public String toString() {
        return DESCRIPTION;
    }

}
