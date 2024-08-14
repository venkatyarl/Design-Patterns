package com.vy.singleton;

public class DemoSingleThreadSingleton {
    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused (yay!) " +
                "\n" +
                "If you see different values, then 2 singletons were created (booo!!) " +
                "\n\n" +
                "Result: " +
                "\n");
        Singleton singleton1 = Singleton.getInstance("Singleton1");
        Singleton singleton2 = Singleton.getInstance("Singleton2");

        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }
}
