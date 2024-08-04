package com.hoangtn.behavioralpattern.templatemethod.starbuzzbeverages;

public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Step 02: Steeping the tea!");
    }

    @Override
    public void addCondiments() {
        System.out.println("Step 04: Adding lemon!");
    }

}
