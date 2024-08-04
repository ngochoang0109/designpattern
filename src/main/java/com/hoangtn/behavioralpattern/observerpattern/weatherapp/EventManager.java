package com.hoangtn.behavioralpattern.observerpattern.weatherapp;

import com.hoangtn.behavioralpattern.observerpattern.weatherapp.subscriber.Subscriber;

public interface EventManager {

    void registerSubscriber(Subscriber subscriber);
    void unSubscriber(Subscriber subscriber);
    void notifySubscriber();

}
