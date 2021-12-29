package ru.mahalov.singleton.impl;

import ru.mahalov.singleton.MusicSourceSingleton;

public class MusicSourceLazySingleton implements MusicSourceSingleton {
    private static MusicSourceLazySingleton instance;
    private static final String DESCRIPTION = "Lazy Singleton";

    private MusicSourceLazySingleton(){}

    public static MusicSourceLazySingleton getInstance(){
        if (instance == null) instance = new MusicSourceLazySingleton();
        return instance;
    }

    public String toString() {
        return DESCRIPTION;
    }
}
