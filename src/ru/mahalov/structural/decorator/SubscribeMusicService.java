package ru.mahalov.structural.decorator;

public class SubscribeMusicService implements SubscribeService{

    @Override
    public String getDescription() {
        return "Подписка на музыкальный сервис";
    }

    @Override
    public Double getCoast() {
        return 100d;
    }
}
