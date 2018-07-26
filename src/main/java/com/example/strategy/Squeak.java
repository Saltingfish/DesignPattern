package com.example.strategy;

/**
 * Created  by kzp on 2018/7/3
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        //橡皮鸭子吱吱叫
        System.out.println("Squeak");
    }
}
