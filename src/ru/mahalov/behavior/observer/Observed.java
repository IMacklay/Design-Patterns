package ru.mahalov.behavior.observer;

public interface Observed {

    void addSubscribe(Observer observer);
    void removeSubscribe(Observer observer);

    void notifyObservers();
}
