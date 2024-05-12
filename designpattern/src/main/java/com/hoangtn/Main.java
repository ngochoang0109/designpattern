package com.hoangtn;

import com.hoangtn.behavioralpattern.templatemethodpattern.starbuzzbeverages.Coffee;
import com.hoangtn.behavioralpattern.templatemethodpattern.starbuzzbeverages.Tea;

public class Main {
    public static void main(String[] args) {
        // ========================= TEMPLATE METHOD PATTERN =========================
        System.out.println("\nMaking coffee...");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\nMaking tea...");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}