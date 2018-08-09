package com.example.decorator;

/**
 * Created  by kzp on 2018/7/6
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ "
                + beverage.cost());

        Beverage beverage1= new HouseBlend();
        beverage1= new Mocha(beverage1);
       // beverage1= new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+" $ "
                + beverage1.cost());

    }
}
