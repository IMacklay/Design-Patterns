package ru.mahalov.creational.buider;

public abstract class PlaySettings {
    protected int volumeSize;
    protected boolean randomOrderPlaying;
    protected int balance;

    @Override
    public String toString() {
        return "PlaySettingsSubClass{" +
                "volumeSize=" + volumeSize +
                ", randomOrderPlaying=" + randomOrderPlaying +
                ", balance=" + balance +
                '}';
    }
}
