package ru.mahalov.structural.facade;

import ru.mahalov.RunDemo;
import ru.mahalov.structural.facade.MusicSourceImpl.MusicSourceTestImpl;
import ru.mahalov.structural.facade.playmusicImpl.PlayMusicImpl;

public class FacadeDemo implements RunDemo {
    @Override
    public void run() {
        //Код Без фасада
        MusicSource musicSource = new MusicSourceTestImpl();
        PlayList playList = new PlayList(musicSource);
        MusicPlayer musicPlayer = new MusicPlayer(playList);
        musicPlayer.playMusic();

        //Код С использованием фасада
        PlayMusic playMusic = new PlayMusicImpl();
        playMusic.playMusic();
    }
}
