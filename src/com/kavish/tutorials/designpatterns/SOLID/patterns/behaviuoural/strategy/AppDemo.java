package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.strategy;

public class AppDemo {
    public static void main(String[] args) {
        Manager handler = new Manager();
        Manager handler2 = new Manager();
        handler.setStrategy(new Multiply());
        handler.operation(4,5);
        handler2 .setStrategy(new Add());
        handler2.operation(4,5);
    }
}
