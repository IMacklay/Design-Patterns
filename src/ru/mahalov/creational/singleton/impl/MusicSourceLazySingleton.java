package ru.mahalov.creational.singleton.impl;

import ru.mahalov.creational.singleton.MusicSourceSingleton;

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
