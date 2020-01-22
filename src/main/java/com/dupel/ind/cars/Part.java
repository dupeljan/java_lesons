package com.dupel.ind.cars;

public class Part {
    protected Manufacture producer;
    protected String title;
    protected double weight;

    public Part(Manufacture producer, String title, double weight) {
        this.producer = producer;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Part{" +
                "producer=" + producer +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}
