package ru.mahalov;

import ru.mahalov.singleton.impl.MusicSourceLazySingleton;
import ru.mahalov.singleton.impl.MusicSourceSimpleSingleton;
import ru.mahalov.singleton.MusicSourceSingleton;

public class DesignTest {

    public static void main(String[] args) {

        MusicSourceSingleton musicSource = MusicSourceLazySingleton.getInstance();
        MusicSourceSingleton musicSource_one = MusicSourceLazySingleton.getInstance();

        System.out.println(musicSource);
        System.out.println(musicSource == musicSource_one);

    }

}
