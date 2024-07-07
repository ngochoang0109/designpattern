package com.hoangtn;

import com.hoangtn.behavioralpattern.templatemethodpattern.starbuzzbeverages.Coffee;
import com.hoangtn.behavioralpattern.templatemethodpattern.starbuzzbeverages.Tea;

public class Main {
    public static void main(String[] args) {
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