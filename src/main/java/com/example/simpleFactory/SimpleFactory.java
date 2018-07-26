package com.example.simpleFactory;

/**
 * Created  by kzp on 2018/7/6
 */
public class SimpleFactory {

    public Food creatFood(String type)
    {
        Food food = null;
        if (type.equals("bread")) {
            food = new bread();
        }
        else if(type.endsWith("chicken"))
        {
            food=new chicken();
        }
        return food;
    }
}
