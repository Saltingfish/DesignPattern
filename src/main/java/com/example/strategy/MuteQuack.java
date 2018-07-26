package com.example.strategy;

/**
 * Created  by kzp on 2018/7/3
 */
public class MuteQuack implements  QuackBehavior {
    @Override
    public void quack() {
        //什么事都不桌，不会叫
        System.out.println("<<Silence>>");
    }
}
