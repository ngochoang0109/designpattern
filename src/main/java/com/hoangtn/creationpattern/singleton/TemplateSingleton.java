package com.hoangtn.creationpattern.singleton;

public class TemplateSingleton {

    private static TemplateSingleton templateSingleton;

    // other useful instance variable here;

    private TemplateSingleton() {}

    public static TemplateSingleton getInstance() {
        if (templateSingleton == null) {
            templateSingleton = new TemplateSingleton();
        }
        return templateSingleton;
    }

    // other useful method here

}
