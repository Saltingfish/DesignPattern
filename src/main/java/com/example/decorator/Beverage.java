package com.example.decorator;

/**
 * Created  by kzp on 2018/7/6
 */
public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
