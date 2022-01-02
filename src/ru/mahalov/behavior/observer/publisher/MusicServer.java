package ru.mahalov.behavior.observer.publisher;

import ru.mahalov.behavior.observer.Observed;
import ru.mahalov.behavior.observer.Observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MusicServer implements Observed {

    List<Observer> subscribers = new LinkedList<>();
    List<String> musicTracks = new ArrayList<>();

    @Override
    public void addSubscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (subscribers.size() == 0){
            System.out.println("< Подписчики отсутствуют >\n");
            return;
        }

        System.out.println("Рассылка обновления "+subscribers.size()+"-м подписчикам ...");

        for(Observer subscriber: subscribers){
            subscriber.handlEvent(musicTracks);
        }
    }

    public void addMusicTrack(String musicTrack){
        System.out.println("==============================================");
        System.out.println("=== Плейлист обновлен: Добавлен новый трек ===");
        System.out.println("==============================================");
        musicTracks.add(musicTrack);
        notifyObservers();
    }

    public void removeMusicTrack(String musicTrack){
        System.out.println("======================================");
        System.out.println("=== Плейлист обновлен: Удален трек ===");
        System.out.println("======================================");
        musicTracks.remove(musicTrack);
        notifyObservers();
    }
}
