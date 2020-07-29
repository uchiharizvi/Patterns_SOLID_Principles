package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.template;

public class AppDemo {

    public static void main(String[] args) {
        ElectricVehicle car = new ElectricCar();//Always Initialize with Interface
        car.chargeBattery();
    }
}
