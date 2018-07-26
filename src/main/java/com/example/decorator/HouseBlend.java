package com.example.decorator;

/**
 * Created  by kzp on 2018/7/6
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
