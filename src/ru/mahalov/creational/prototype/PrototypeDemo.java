package ru.mahalov.creational.prototype;

import ru.mahalov.RunDemo;
import ru.mahalov.creational.singleton.MusicSourceSingleton;
import ru.mahalov.creational.singleton.impl.MusicSourceClassHolderSingleton;

public class PrototypeDemo implements RunDemo {
    @Override
    public void run() {

        MusicSourceSingleton musicSource = MusicSourceClassHolderSingleton.getInstance();

        Song song_one = new Song("AC/DC","Hells Bells", 185000, musicSource);

        Song song_two = null;

        try {
            song_two = song_one.clone();
            song_two.setTitle("Black in black");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //song_two.setMusicSource(MusicSourceSimpleSingleton.getInstance());

        System.out.println(song_one);
        System.out.println(song_two);

        System.out.println( "Ссылка объектов одинаковая - "+(song_one == song_two) );
        System.out.println( "Ссылка поля на др. класс та же - "+(song_one.getMusicSource()==song_two.getMusicSource()) );
    }
}
