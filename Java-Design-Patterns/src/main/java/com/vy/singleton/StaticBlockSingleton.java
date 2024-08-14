package com.vy.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating static block singleton", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
