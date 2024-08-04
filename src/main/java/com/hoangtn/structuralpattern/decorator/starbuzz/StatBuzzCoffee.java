package com.hoangtn.structuralpattern.decorator.starbuzz;

import com.hoangtn.structuralpattern.decorator.starbuzz.component.Beverage;
import com.hoangtn.structuralpattern.decorator.starbuzz.concretecomponent.Espresso;
import com.hoangtn.structuralpattern.decorator.starbuzz.concretecomponent.HouseBlend;
import com.hoangtn.structuralpattern.decorator.starbuzz.decorator.Mocha;

public class StatBuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
    
}
