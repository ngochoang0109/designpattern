package com.hoangtn;

import com.hoangtn.behavioralpattern.templatemethod.starbuzzbeverages.Coffee;
import com.hoangtn.behavioralpattern.templatemethod.starbuzzbeverages.Tea;
import com.hoangtn.creationpattern.abstractfactory.model.Pizza;
import com.hoangtn.creationpattern.abstractfactory.service.ChicagoPizzaStore;
import com.hoangtn.creationpattern.abstractfactory.service.NYPizzaStore;
import com.hoangtn.creationpattern.abstractfactory.service.PizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================= FACTORY PATTERN =========================");
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
        System.out.println("========================= FACTORY PATTERN =========================");

        System.out.println("========================= TEMPLATE METHOD PATTERN =========================");
        System.out.println("Making coffee...");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("Making tea...");
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("========================= TEMPLATE METHOD PATTERN =========================");

        System.out.println("========================= SINGLETON PATTERN =========================");
        // TODO: run example here
        System.out.println("========================= SINGLETON METHOD PATTERN =========================");

    }
}