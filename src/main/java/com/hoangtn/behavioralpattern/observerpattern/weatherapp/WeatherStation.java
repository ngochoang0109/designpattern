package com.hoangtn.behavioralpattern.observerpattern.weatherapp;

import com.hoangtn.behavioralpattern.observerpattern.weatherapp.subscriber.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args) {

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();

        WeatherData weatherData = new WeatherData();
        weatherData.registerSubscriber(currentDisplay);
        weatherData.setMeasurements(10, 11, 12);


    }

}
