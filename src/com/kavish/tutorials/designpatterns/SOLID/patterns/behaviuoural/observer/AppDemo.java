package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.observer;

public class AppDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer weatherObserver = new WeatherObserver(weatherStation);

        weatherStation.setPressure(100);
        weatherStation.setTemperature(95);
        weatherStation.setHumidity(87);
    }
}
