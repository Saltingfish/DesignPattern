package com.example.simpleFactory;

/**
 * Created  by kzp on 2018/7/6
 */
public class FoodStore {
    SimpleFactory factory;
    public FoodStore(SimpleFactory factory)
    {
        this.factory=factory;
    }
    public Food orderFood(String type) {
        Food food = factory.creatFood(type);
        food.prepare();
        food.cut();
        food.box();
        return food;
    }
}