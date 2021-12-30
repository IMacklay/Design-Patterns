package ru.mahalov.creational.singleton.impl;

import ru.mahalov.creational.singleton.MusicSourceSingleton;

public class MusicSourceDoubleCheckingLocking implements MusicSourceSingleton {
    private static volatile MusicSourceDoubleCheckingLocking instance;
    private static final String DESCRIPTION = "Singleton Double checking locking";

    private MusicSourceDoubleCheckingLocking(){}

    public static MusicSourceDoubleCheckingLocking getInstance(){
        if (instance == null) {
            synchronized (MusicSourceDoubleCheckingLocking.class) {
                if (instance == null) {
                    instance = new MusicSourceDoubleCheckingLocking();
                }
            }
        }

        return instance;
    }

    public String toString() {
        return DESCRIPTION;
    }

}
