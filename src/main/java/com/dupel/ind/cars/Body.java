package com.dupel.ind.cars;

public class Body extends Part {
    private String color;
    int door_count;
    int seats_cout;

    public Body(Manufacture producer, String title, double weight, String color, int door_count, int seats_cout) {
        super(producer, title, weight);
        this.color = color;
        this.door_count = door_count;
        this.seats_cout = seats_cout;
    }

    @Override
    public String toString() {
        return "Body{" +
                "color='" + color + '\'' +
                ", door_count=" + door_count +
                ", seats_cout=" + seats_cout +
                ", producer=" + producer +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}
