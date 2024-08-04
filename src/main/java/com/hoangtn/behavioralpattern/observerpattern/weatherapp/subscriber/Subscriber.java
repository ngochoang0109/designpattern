package com.hoangtn.behavioralpattern.observerpattern.weatherapp.subscriber;

public interface Subscriber {

    void update(float temp, float humidity, float pressure);

}
