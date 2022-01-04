package ru.mahalov.structural.facade.MusicSourceImpl;

import ru.mahalov.structural.facade.MusicSource;
import ru.mahalov.structural.facade.Song;

import java.util.ArrayList;
import java.util.List;

public class MusicSourceTestImpl implements MusicSource {

    List<Song> listOfSong = new ArrayList<>();
    {
        listOfSong.add(new Song("Nirvana","Ten like spirit"));
        listOfSong.add(new Song("Bon Jovi","It's my life"));
    }


    @Override
    public List<Song> getMusicList() {
        return listOfSong;
    }

}
