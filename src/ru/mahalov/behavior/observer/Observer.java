package ru.mahalov.behavior.observer;

import java.util.List;

public interface Observer {

    void handlEvent(List<String> newMusicTracks);

}
