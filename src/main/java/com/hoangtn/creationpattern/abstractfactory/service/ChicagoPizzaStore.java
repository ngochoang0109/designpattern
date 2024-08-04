package com.hoangtn.creationpattern.abstractfactory.service;

import com.hoangtn.creationpattern.abstractfactory.model.ChicagoStyleCheesePizza;
import com.hoangtn.creationpattern.abstractfactory.model.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        // or else other style here...
        return null;
    }
}
