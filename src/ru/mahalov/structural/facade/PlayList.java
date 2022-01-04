package ru.mahalov.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Song> listOfSongs;

    public PlayList(MusicSource musicSource) {
        this.listOfSongs = musicSource.getMusicList();
    }

    public List<Song> getListOfSongs() {
        return listOfSongs;
    }
}
