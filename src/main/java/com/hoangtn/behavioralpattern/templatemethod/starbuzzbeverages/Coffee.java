package com.hoangtn.behavioralpattern.templatemethod.starbuzzbeverages;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Step 02: Dripping coffee through filter!");
    }

    @Override
    public void addCondiments() {
        System.out.println("Step 04: Adding sugar and milk!");
    }

}
