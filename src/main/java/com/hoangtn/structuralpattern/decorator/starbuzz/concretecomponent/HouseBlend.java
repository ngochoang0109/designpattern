package com.hoangtn.structuralpattern.decorator.starbuzz.concretecomponent;

import com.hoangtn.structuralpattern.decorator.starbuzz.component.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
