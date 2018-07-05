package com.example.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created  by kzp on 2018/7/4
 */
public class CurrentConditionsDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    private void display() {
        System.out.println(" Current conditions:" + temperature +
                "F degress and " + humidity + "%humidity");
    }
}
