package com.dupel.ind.cars;

import java.util.List;

public class Car {
    private Manufacture producer;
    private String title;
    private List<Part> parts;
    private Wheel wheel_kind;
    private Body body_kind;
    private int meleage;

    public Car(Manufacture producer, String title, List<Part> parts, Wheel wheel_kind, Body body_kind, int meleage) {
        this.producer = producer;
        this.title = title;
        this.parts = parts;
        this.wheel_kind = wheel_kind;
        this.body_kind = body_kind;
        this.meleage = meleage;
    }

    public Manufacture getProducer() {
        return producer;
    }

    public List<Part> getParts() {
        return parts;
    }

    public Wheel getWheel_kind() {
        return wheel_kind;
    }

    public Body getBody_kind() {
        return body_kind;
    }

    public int getMeleage() {
        return meleage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer=" + producer.toString() +
                ", title='" + title + '\'' +
                ", parts=" + parts.toString() +
                ", wheel_kind=" + wheel_kind.toString() +
                ", body_kind=" + body_kind.toString() +
                ", meleage=" + meleage +
                '}';
    }
}
