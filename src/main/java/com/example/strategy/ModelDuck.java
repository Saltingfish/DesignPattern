package com.example.strategy;

/**
 * Created  by kzp on 2018/7/3
 */
public class ModelDuck extends Duck {


    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
