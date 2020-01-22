package com.dupel.labs.task6;

import java.io.*;
import java.util.Arrays;

public class Serialization {
    final static String filename = "Serialization/serializedInstance.ser";

    private static void serializeObject(Object object) {
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);

            objectOutputStream.writeObject(object);

            objectOutputStream.close();
            file.close();
            System.out.println("object serialized!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ProductsDataModel deserializeObject() {
        ProductsDataModel instance = null;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(file);

            instance = (ProductsDataModel) objectInputStream.readObject();

            objectInputStream.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return instance;
    }


    public static void main(String[] args) {
        ProductsDataModel product = new ProductsDataModel("Cheese",1000,50,200);


        serializeObject(product);
        ProductsDataModel deserializeInstance = deserializeObject();

        System.out.println("\n DESERIALIZED OBJECT: ");
        System.out.println(deserializeInstance.toString());
    }
}
