package com.vy.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = null;

        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
