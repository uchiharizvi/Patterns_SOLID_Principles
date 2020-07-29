package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.template;

public class ElectricCar implements ElectricVehicle {
    @Override
    public void speed() {
        System.out.println("Speed up with Normal Car..");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging Battery of Electric Car..");
    }
}
