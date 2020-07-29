package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new QuickSort());
    }
}
