package com.hoangtn.behavioralpattern.observerpattern.weatherapp.subscriber;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Subscriber {

    private float temperature;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }

    public void display() {
        System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");
    }

}
