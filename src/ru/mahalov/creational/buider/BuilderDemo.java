package ru.mahalov.creational.buider;

import ru.mahalov.RunDemo;
import ru.mahalov.creational.buider.VariantI.PlaySettingsSubClass;

public class BuilderDemo implements RunDemo {

    @Override
    public void run() {
        PlaySettings playSettings = new PlaySettingsSubClass.Builder(10)
                .setBalance(5)
                .setRandomOrderPlaying(true)
                .build();

        System.out.println(playSettings);
    }
}
