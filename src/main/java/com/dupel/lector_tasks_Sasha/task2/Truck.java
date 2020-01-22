package com.dupel.lector_tasks_Sasha.task2;

public class Truck extends Car {
    private float capacity;
    private boolean empty = true;



    public Truck(String brand, String model, Double engineСapacity, float capacity) {
        super(brand, model, engineСapacity);
        this.capacity = capacity;
    }

    public boolean getEmpty() {
        return empty;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    @Override
    public String toString() {
        return super.toString() + " Truck{" +
                "capacity=" + capacity +
                ", empty=" + empty +
                '}';
    }
}
