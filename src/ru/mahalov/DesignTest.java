package ru.mahalov;

import ru.mahalov.behavior.observer.ObserverDemo;
import ru.mahalov.creational.buider.BuilderDemo;
import ru.mahalov.creational.buider.PlaySettings;
import ru.mahalov.creational.buider.VariantI.PlaySettingsSubClass;
import ru.mahalov.creational.prototype.PrototypeDemo;
import ru.mahalov.creational.prototype.Song;
import ru.mahalov.creational.singleton.SingletonDemo;
import ru.mahalov.creational.singleton.impl.*;
import ru.mahalov.creational.singleton.MusicSourceSingleton;

public class DesignTest {

    public static void main(String[] args) {

        // ======= Singleton ========
        separator("Singleton Demo");
        RunDemo singletonDemo = new SingletonDemo();
        singletonDemo.run();

        // ======= Prototype ========
        separator("Prototype Demo");
        RunDemo prototypeDemo = new PrototypeDemo();
        prototypeDemo.run();

        // ======= Builder ========
        separator("Builder Demo");
        RunDemo builderDemo = new BuilderDemo();
        builderDemo.run();

        // ======= Observer ========
        separator("Observer");
        RunDemo observerDemo = new ObserverDemo();
        observerDemo.run();

    }

    private static void separator(String title){
        System.out.println("\n ============= "+title+" =============\n");
    }

}
