package ru.mahalov;

import ru.mahalov.creational.singleton.impl.*;
import ru.mahalov.creational.singleton.MusicSourceSingleton;

public class DesignTest {

    public static void main(String[] args) {

        MusicSourceSingleton musicSource = MusicSourceClassHolderSingleton.getInstance();
        MusicSourceSingleton musicSource_one = MusicSourceClassHolderSingleton.getInstance();

        System.out.println(musicSource);
        System.out.println(musicSource == musicSource_one);

    }

}
