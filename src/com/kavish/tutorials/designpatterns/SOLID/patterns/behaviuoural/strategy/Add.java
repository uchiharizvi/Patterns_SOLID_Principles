package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.strategy;

public class Add implements Strategy {
    @Override
    public void operation(int num1, int num2) {
        System.out.println("Addition : " + num1+num2);
    }
}
