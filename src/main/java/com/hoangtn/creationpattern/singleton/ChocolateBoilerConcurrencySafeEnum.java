package com.hoangtn.creationpattern.singleton;

import lombok.Getter;

public enum ChocolateBoilerConcurrencySafeEnum {

    INSTANCE;

    private ChocolateBoilerConcurrencySafe instance;

    public ChocolateBoilerConcurrencySafe getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerConcurrencySafe();
        }
        return instance;
    }

}
