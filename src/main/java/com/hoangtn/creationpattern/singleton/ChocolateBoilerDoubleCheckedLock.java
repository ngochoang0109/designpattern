package com.hoangtn.creationpattern.singleton;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicReference;

@Getter
public class ChocolateBoilerDoubleCheckedLock {

    private boolean empty;
    private boolean boiled;

    // The volatile keyword ensures that multiple threads handle the [instance] variable correctly
    // when it is being initialized to the Singleton instance.
    private static AtomicReference<ChocolateBoilerDoubleCheckedLock> instance = new AtomicReference<>(null);

    /**
     * This code is only started when the boiler is empty!
     */
    private ChocolateBoilerDoubleCheckedLock() {
        this.empty = true;
        this.boiled = false;
    }

    /**
     * By adding the synchronized keyword to getInstance(), we force every thread to wait its turn before it can enter the method.
     * That is, no two threads may enter the method at the same time.
     *
     * @return instance of ChocolateBoiler
     */
    public static synchronized ChocolateBoilerDoubleCheckedLock getInstance() {
        ChocolateBoilerDoubleCheckedLock localInstance = instance.get();
        // Check for an instance and if there isn’t one, enter a synchronized block
        if (localInstance == null) {
            // Note we only synchronize the first time through!
            synchronized (ChocolateBoilerDoubleCheckedLock.class) {
                if (localInstance == null) {
                    localInstance = new ChocolateBoilerDoubleCheckedLock();
                    instance.set(localInstance);
                }
            }
        }
        return localInstance;
    }

    /**
     * To fill the boiler it must be empty, and, once it’s full, we set the empty and boiled flags.
     */
    public void fill() {
        if (this.isEmpty()) {
            this.empty = false;
            this.boiled = false;
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
        if (!this.isEmpty() && !this.isBoiled()) {
            // bring the contents to a boil
            this.boiled = true;
        }
    }

}
