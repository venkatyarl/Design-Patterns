package com.vy.singleton;

public class ThreadSafeSingletonWithDoubleLocking {
    private static ThreadSafeSingletonWithDoubleLocking instance;

    private ThreadSafeSingletonWithDoubleLocking() {}

    private static ThreadSafeSingletonWithDoubleLocking getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonWithDoubleLocking.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonWithDoubleLocking();
                }
            }
        }
        return instance;
    }
}
