package com.hoangtn.creationpattern.singleton;

import lombok.Getter;

@Getter
public class ChocolateBoilerConcurrencySafe {

    private boolean empty;
    private boolean boiled;

    /**
     * To fill the boiler it must be empty, and, once it’s full, we set the empty and boiled flags.
     */
    public void fill() {
        if (this.isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    /**
     * To drain the boiler, it must be full (non-empty) and also boiled.
     * Once it is drained we set empty back to true.
     */
    public void drain() {
        if (!this.isEmpty() && this.isBoiled()) {
            // drain the boiled milk and chocolate
            this.empty = true;
        }
    }

    /**
     * To boil the mixture, the boiler has to be full and not already boiled.
     * Once it’s boiled we set the boiled flag to true.
     */
    public void boil() {
        if (!this.isEmpty() && this.isBoiled()) {
            // bring the contents to a boil
            this.boiled = true;
        }
    }

}
