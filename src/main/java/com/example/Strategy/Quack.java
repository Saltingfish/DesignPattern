package com.example.Strategy;

/**
 * Created  by kzp on 2018/7/3
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        //实现鸭子呱呱叫
        System.out.println("Quack");
    }
}
