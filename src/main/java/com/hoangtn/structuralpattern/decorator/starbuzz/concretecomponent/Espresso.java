package com.hoangtn.structuralpattern.decorator.starbuzz.concretecomponent;

import com.hoangtn.structuralpattern.decorator.starbuzz.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
