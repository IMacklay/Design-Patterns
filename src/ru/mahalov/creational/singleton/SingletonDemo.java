package ru.mahalov.creational.singleton;

import ru.mahalov.RunDemo;
import ru.mahalov.creational.singleton.impl.MusicSourceClassHolderSingleton;

public class SingletonDemo implements RunDemo {

    @Override
    public void run() {
        MusicSourceSingleton musicSource = MusicSourceClassHolderSingleton.getInstance();
        MusicSourceSingleton musicSource_one = MusicSourceClassHolderSingleton.getInstance();

        System.out.println(musicSource);
        System.out.println( "Ссылка объектов одинаковая - "+(musicSource == musicSource_one) );
    }
}
