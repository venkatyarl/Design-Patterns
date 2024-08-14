package com.vy.singleton;

public class ThreadSafeSingletonWithSingleLocking {
    private static ThreadSafeSingletonWithSingleLocking instance;

    private ThreadSafeSingletonWithSingleLocking() {}

    public static synchronized ThreadSafeSingletonWithSingleLocking getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonWithSingleLocking();
        }
        return instance;
    }
}
