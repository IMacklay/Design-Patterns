package ru.mahalov.structural.decorator;

public abstract class SubscribeMusicServiceDecorator implements SubscribeService{

   private final SubscribeService subscribeService;

    public SubscribeMusicServiceDecorator(SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
    }

    @Override
    public String getDescription() {
        return subscribeService.getDescription();
    }

    @Override
    public Double getCoast() {
        return subscribeService.getCoast();
    }
}
