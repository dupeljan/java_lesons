package com.dupel.lector_tasks_Sasha.task2;

public class Car {
    private String brand;
    private String model;
    private Double engineСapacity;

    public Car(String brand, String model, Double engineСapacity) {
        this.brand = brand;
        this.model = model;
        this.engineСapacity = engineСapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineСapacity() {
        return engineСapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineСapacity(Double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineСapacity=" + engineСapacity +
                '}';
    }
}
