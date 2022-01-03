package ru.mahalov.structural.decorator.subscribeoption;

import ru.mahalov.structural.decorator.SubscribeMusicServiceDecorator;
import ru.mahalov.structural.decorator.SubscribeService;

public class DiscountToSubscribe extends SubscribeMusicServiceDecorator {

    public DiscountToSubscribe(SubscribeService subscribeService) {
        super(subscribeService);
    }

    @Override
    public Double getCoast(){
        return super.getCoast() - super.getCoast() * 0.5;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", Скидка 50%";
    }
}
