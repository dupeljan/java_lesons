package com.dupel.ind.cars;

public class Lamp extends Part {
    private int lightStrength;

    public Lamp(Manufacture producer, String title, double weight, int lightStrength) {
        super(producer, title, weight);
        this.lightStrength = lightStrength;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "lightStrength=" + lightStrength +
                ", producer=" + producer +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}
