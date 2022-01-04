package ru.mahalov.structural.facade.playmusicImpl;

import ru.mahalov.structural.facade.MusicPlayer;
import ru.mahalov.structural.facade.MusicSource;
import ru.mahalov.structural.facade.MusicSourceImpl.MusicSourceTestImpl;
import ru.mahalov.structural.facade.PlayList;
import ru.mahalov.structural.facade.PlayMusic;

//Класс фасад
public class PlayMusicImpl implements PlayMusic {

    MusicSource musicSource;
    PlayList playList;
    MusicPlayer musicPlayer;

    public PlayMusicImpl(MusicSource musicSource) {
        this.musicSource = musicSource;
        initPlayMusic();
    }

    public PlayMusicImpl() {
        this.musicSource = new MusicSourceTestImpl();
        initPlayMusic();
    }

    private void initPlayMusic(){
        playList = new PlayList(musicSource);
        musicPlayer = new MusicPlayer(playList);
    }

    @Override
    public void playMusic() {
        musicPlayer.playMusic();
    }
}
