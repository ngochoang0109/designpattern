package com.hoangtn.creationpattern.abstractfactory.service;

import com.hoangtn.creationpattern.abstractfactory.model.NYStyleCheesePizza;
import com.hoangtn.creationpattern.abstractfactory.model.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        // or else other style here...
        return null;
    }
}
