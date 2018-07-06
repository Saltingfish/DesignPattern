package com.example.Factory;

/**
 * Created  by kzp on 2018/7/6
 */
public abstract class Store {
    public Food orderFood(String type) {
        Food food = creatFood(type);
        food.prepare();
        food.cut();
        food.box();
        return food;

    }

    public abstract Food creatFood(String type); //抽象方法，父类并不知道具体的对象类型，这将由子类决定
}