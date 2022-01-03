package ru.mahalov.structural.decorator.subscribeoption;

import ru.mahalov.structural.decorator.SubscribeMusicServiceDecorator;
import ru.mahalov.structural.decorator.SubscribeService;

public class AccessToKaraoke extends SubscribeMusicServiceDecorator {
    public AccessToKaraoke(SubscribeService subscribeService) {
        super(subscribeService);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Доступ к Караоке";
    }

    @Override
    public Double getCoast() {
        return super.getCoast()+50;
    }
}
