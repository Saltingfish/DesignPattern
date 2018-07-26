package com.example.strategy;

/**
 * Created  by kzp on 2018/7/3
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //什么事都不管，不会飞
        System.out.println("I can't fly");
    }
}
