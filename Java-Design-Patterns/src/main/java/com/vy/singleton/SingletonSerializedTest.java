package com.vy.singleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instance1 = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instance1);
        out.close();

        // deserialize from file to Object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instance2 = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("Instance1 hashCode = " + instance1);
        System.out.println("Instance2 hashCode = " + instance2);
    }
}
