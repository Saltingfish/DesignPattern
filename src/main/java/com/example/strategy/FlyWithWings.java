package com.example.strategy;

/**
 * Created  by kzp on 2018/7/3
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        //实现鸭子的飞行
        System.out.println("I'm flying!!");
    }
}
