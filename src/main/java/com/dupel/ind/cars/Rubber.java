package com.dupel.ind.cars;

public class Rubber extends  Part{
    private String kind;

    public Rubber(Manufacture producer, String title, double weight, String kind) {
        super(producer, title, weight);
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Rubber{" +
                "kind='" + kind + '\'' +
                ", producer=" + producer +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}
