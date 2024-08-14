package com.vy.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!) " +
                "\n" +
                "If you see different values, then 2 singletons were created (booo!!) " +
                "\n\n" +
                "Result: " +
                "\n");

        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());

        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance("Singleton1");
            System.out.println(singleton1.value);
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance("Singleton2");
            System.out.println(singleton2.value);
        }
    }
}
