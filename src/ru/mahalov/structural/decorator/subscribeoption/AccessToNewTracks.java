package ru.mahalov.structural.decorator.subscribeoption;

import ru.mahalov.structural.decorator.SubscribeMusicServiceDecorator;
import ru.mahalov.structural.decorator.SubscribeService;

public class AccessToNewTracks extends SubscribeMusicServiceDecorator {

    public AccessToNewTracks(SubscribeService subscribeService) {
        super(subscribeService);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Доступ к новым трекам";
    }

    @Override
    public Double getCoast() {
        return super.getCoast()+20;
    }
}
