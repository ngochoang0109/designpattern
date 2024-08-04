package com.hoangtn.structuralpattern.decorator.starbuzz.component;

import lombok.Getter;

@Getter
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public abstract double cost();

    // other methods

}
