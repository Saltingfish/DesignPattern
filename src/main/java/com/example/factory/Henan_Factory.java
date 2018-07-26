package com.example.factory;

/**
 * Created  by kzp on 2018/7/6
 */
public class Henan_Factory implements  abstract_Factory{
    @Override
    public Food creatBread() {
        return new Henan_bread();
    }

    @Override
    public Food creatChicken() {
        return new Henan_chicken();
    }
}
