package com.hannalata.model;

public final class SingletonExample {

    private static SingletonExample INSTANCE;

    private SingletonExample() {
    }

    public static SingletonExample getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }
}
