package com.example.factory;

/**
 * Created  by kzp on 2018/7/6
 */
public class abstract_Factory_Story {
    Food food;

    public Food orderFood(String type,abstract_Factory factory) {
        if("bread".equals(type)){
            food = factory.creatBread();}
        else if("chicken".equals(type))
        {
            food = factory.creatChicken();
        }
        food.prepare();
        food.cut();
        food.box();
        return food;
    }
    public static void main(String[] args)
    {
        abstract_Factory_Story afs=new abstract_Factory_Story();
        afs.orderFood("bread", new Hebei_Factory());
        afs.orderFood("chicken", new Henan_Factory());
    }
}
