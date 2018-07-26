package com.example.adapter;

/**
 * Created  by kzp on 2018/7/26
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;


    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void jiao() {
        turkey.gobble();
    }
}
