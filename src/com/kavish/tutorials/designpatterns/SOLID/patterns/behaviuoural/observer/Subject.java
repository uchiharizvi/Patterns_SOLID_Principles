package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.observer;

public interface Subject {
    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyAllObservers();
}
