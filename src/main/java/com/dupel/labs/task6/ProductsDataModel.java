package com.dupel.labs.task6;

import java.io.Serializable;

public class ProductsDataModel implements Serializable {
    private String title;
    private int calories;
    private int fats;
    private int cost;

    public ProductsDataModel(String title, int calories, int fats, int cost) {
        this.title = title;
        this.calories = calories;
        this.fats = fats;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ProductsDataModel{" +
                "title='" + title + '\'' +
                ", calories=" + calories +
                ", fats=" + fats +
                ", cost=" + cost +
                '}';
    }
}
