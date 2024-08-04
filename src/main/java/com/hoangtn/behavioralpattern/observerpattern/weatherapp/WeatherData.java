package com.hoangtn.behavioralpattern.observerpattern.weatherapp;

import com.hoangtn.behavioralpattern.observerpattern.weatherapp.subscriber.Subscriber;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements EventManager {

    private List<Subscriber> subscribers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        if (subscriber == null) {
            throw new RuntimeException();
        }
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscriber(Subscriber subscriber) {
        int i = subscribers.indexOf(subscriber);
        if (i >= 0) {
            subscribers.remove(i);
        }
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber observer : subscribers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged() {
        notifySubscriber();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
