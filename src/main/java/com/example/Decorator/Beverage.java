package com.example.Decorator;

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
