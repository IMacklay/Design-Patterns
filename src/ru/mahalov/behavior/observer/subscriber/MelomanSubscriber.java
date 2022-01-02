package ru.mahalov.behavior.observer.subscriber;

import ru.mahalov.behavior.observer.Observer;

import java.util.List;
import java.util.stream.Collectors;

public class MelomanSubscriber implements Observer {

    String name;

    public MelomanSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void handlEvent(List<String> allMusicList) {
        System.out.println("========================================================\n" +
                "Dear, "+name+"! We are have update for your MusicList\n"
                + allMusicList.stream().reduce((x,y)-> x+"\n"+y).orElse("")
                + "\n========================================================\n");
    }
}
