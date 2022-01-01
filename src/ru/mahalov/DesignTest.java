package ru.mahalov;

import ru.mahalov.creational.buider.PlaySettings;
import ru.mahalov.creational.buider.VariantI.PlaySettingsSubClass;
import ru.mahalov.creational.prototype.Song;
import ru.mahalov.creational.singleton.impl.*;
import ru.mahalov.creational.singleton.MusicSourceSingleton;

public class DesignTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        // ======= Singleton ========
        separator("Singleton Demo");
        MusicSourceSingleton musicSource = MusicSourceClassHolderSingleton.getInstance();
        MusicSourceSingleton musicSource_one = MusicSourceClassHolderSingleton.getInstance();

        System.out.println(musicSource);
        System.out.println( "Ссылка объектов одинаковая - "+(musicSource == musicSource_one) );

        // ======= Prototype ========
        separator("Prototype Demo");
        Song song_one = new Song("AC/DC","Hells Bells", 185000, musicSource);

        Song song_two = song_one.clone();

        song_two.setTitle("Black in black");
        //song_two.setMusicSource(MusicSourceSimpleSingleton.getInstance());

        System.out.println(song_one);
        System.out.println(song_two);

        System.out.println( "Ссылка объектов одинаковая - "+(song_one == song_two) );
        System.out.println( "Ссылка поля на др. класс та же - "+(song_one.getMusicSource()==song_two.getMusicSource()) );

        // ======= Builder ========
        separator("Builder Demo");

        PlaySettings playSettings = new PlaySettingsSubClass.Builder(10)
                .setBalance(5)
                .setRandomOrderPlaying(true)
                .build();

        System.out.println(playSettings);

    }

    private static void separator(String title){
        System.out.println("\n ============= "+title+" =============\n");
    }

}
