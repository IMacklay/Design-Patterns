package ru.mahalov.singleton.impl;

import ru.mahalov.singleton.MusicSourceSingleton;

public class MusicSourceClassHolderSingleton implements MusicSourceSingleton {

    private static final String DESCRIPTION = "Class Holder Singleton";

    private MusicSourceClassHolderSingleton(){}

    private static class HolderSingleton{
        private static final MusicSourceClassHolderSingleton instanceHolder = new MusicSourceClassHolderSingleton();
    }

    public static MusicSourceClassHolderSingleton getInstance(){
        return HolderSingleton.instanceHolder;
    }

    public String toString() {
        return DESCRIPTION;
    }
}
