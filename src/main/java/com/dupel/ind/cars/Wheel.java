package com.dupel.ind.cars;

public class Wheel extends Part {
    private  int radius;
    Rubber ruber_type;

    public Wheel(Manufacture producer, String title, double weight, int radius, Rubber ruber_type) {
        super(producer, title, weight);
        this.radius = radius;
        this.ruber_type = ruber_type;
    }

    public int getRadius() {
        return radius;
    }

    public Rubber getRuber_type() {
        return ruber_type;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", ruber_type=" + ruber_type +
                ", producer=" + producer +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}
