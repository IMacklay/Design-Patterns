package ru.mahalov.singleton.impl;

import ru.mahalov.singleton.MusicSourceSingleton;

public class MusicSourceSimpleSingleton implements MusicSourceSingleton {

    private static final MusicSourceSimpleSingleton instance = new MusicSourceSimpleSingleton();
    private static final String DESCRIPTION = "Simple Singleton";

    private MusicSourceSimpleSingleton(){}

    public static MusicSourceSimpleSingleton getInstance(){
        return instance;
    }

    public String toString() {
        return DESCRIPTION;
    }
}
