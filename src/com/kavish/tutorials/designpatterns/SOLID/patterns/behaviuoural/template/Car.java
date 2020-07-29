package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.template;

public class Car implements NormalVehicle{
    @Override
    public void speed() {
        System.out.println("Speed up with Normal Car..");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to Normal Car..");
    }
}
