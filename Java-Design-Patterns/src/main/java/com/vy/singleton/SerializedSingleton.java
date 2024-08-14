package com.vy.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {}

    private static class SingletonHolder {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
