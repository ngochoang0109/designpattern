package com.hoangtn.behavioralpattern.templatemethodpattern.starbuzzbeverages;

public abstract class CaffeineBeverage {

    protected abstract void brew();
    protected abstract void addCondiments();

    public final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if (this.customerWantCondiments()) {
            this.addCondiments();
        }
    }
    
    protected void boilWater() {
        System.out.println("Step 01: Boil water!");
    }

    protected void pourInCup() {
        System.out.println("Step 03: Pour in cup!");
    }

    protected boolean customerWantCondiments() {
        return true;
    }
}
