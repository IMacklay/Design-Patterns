package ru.mahalov.behavior.observer;

import ru.mahalov.RunDemo;
import ru.mahalov.behavior.observer.publisher.MusicServer;
import ru.mahalov.behavior.observer.subscriber.MelomanSubscriber;

public class ObserverDemo implements RunDemo {
    public void run(){

        MusicServer musicServer = new MusicServer();
        //Добавляем трек, не имея подписчиков
        musicServer.addMusicTrack("Nirvana - Ten like a spirit");

        //Создаем подписчиков
        Observer melomanSubscriber_one = new MelomanSubscriber("Mahalov Maxim");
        Observer melomanSubscriber_two = new MelomanSubscriber("Joe Black");

        //Подписываемся на событие
        musicServer.addSubscribe(melomanSubscriber_one);
        musicServer.addSubscribe(melomanSubscriber_two);

        //Добавляем трек
        musicServer.addMusicTrack("Bon Jovi - It's my life");

        //Отписываем одного подписчика
        musicServer.removeSubscribe(melomanSubscriber_one);

        //Удаляем трек
        musicServer.removeMusicTrack("Nirvana - Ten like a spirit");

    }
}
