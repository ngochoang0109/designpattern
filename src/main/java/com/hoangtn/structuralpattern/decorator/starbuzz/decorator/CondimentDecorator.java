package com.hoangtn.structuralpattern.decorator.starbuzz.decorator;

import com.hoangtn.structuralpattern.decorator.starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
