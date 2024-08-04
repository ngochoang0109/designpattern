package com.hoangtn.structuralpattern.decorator.starbuzz.decorator;

import com.hoangtn.structuralpattern.decorator.starbuzz.component.Beverage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mocha extends CondimentDecorator {
    private final String FUNC_NAME = "Mocha";
    private Beverage beverage;

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.FUNC_NAME;
    }

}
