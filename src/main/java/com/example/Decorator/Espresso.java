package com.example.Decorator;

/**
 * Created  by kzp on 2018/7/6
 */
public class Espresso extends Beverage {

    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
