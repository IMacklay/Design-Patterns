package ru.mahalov.structural.decorator;

import ru.mahalov.RunDemo;
import ru.mahalov.structural.decorator.subscribeoption.AccessToKaraoke;
import ru.mahalov.structural.decorator.subscribeoption.AccessToNewTracks;
import ru.mahalov.structural.decorator.subscribeoption.DiscountToSubscribe;

public class DecoratorDemo implements RunDemo {
    @Override
    public void run() {

        SubscribeService standardSubscribe = new SubscribeMusicService();
        System.out.println(standardSubscribe.getDescription()+"    / Стоимость: "+standardSubscribe.getCoast());

        SubscribeService subscribeWithNewTrackOption = new AccessToNewTracks(standardSubscribe);
        System.out.println(subscribeWithNewTrackOption.getDescription()+"    / Стоимость: "+subscribeWithNewTrackOption.getCoast());

        SubscribeService subscribeWithKaraokeOption = new AccessToKaraoke(subscribeWithNewTrackOption);
        System.out.println(subscribeWithKaraokeOption.getDescription()+"    / Стоимость: "+subscribeWithKaraokeOption.getCoast());

        SubscribeService subscribeWithDiscountOption = new DiscountToSubscribe(subscribeWithKaraokeOption);
        System.out.println(subscribeWithDiscountOption.getDescription()+"    / Стоимость: "+subscribeWithDiscountOption.getCoast());

        System.out.println("----------");

        SubscribeService customSubscribe = new DiscountToSubscribe(new AccessToKaraoke(new SubscribeMusicService()));
        System.out.println(customSubscribe.getDescription()+"    / Стоимость: "+customSubscribe.getCoast());


    }
}
