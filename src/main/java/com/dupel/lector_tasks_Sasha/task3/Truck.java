package com.dupel.lector_tasks_Sasha.task3;

public class Truck implements Car {
    private String brand;
    private String model;
    private Double engineСapacity;
    private float capacity;
    private boolean empty = true;

    public Truck(String brand, String model, Double engineСapacity, float capacity) {
        this.brand = brand;
        this.model = model;
        this.engineСapacity = engineСapacity;
        this.capacity = capacity;
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineСapacity=" + engineСapacity +
                ", capacity=" + capacity +
                ", empty=" + empty +
                '}';
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setEngineСapacity(Double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Double getEngineСapacity() {
        return engineСapacity;
    }

    public float getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return empty;
    }
}
