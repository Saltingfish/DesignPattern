package com.example.template;

/**
 * Created  by kzp on 2018/7/30
 */
public class BeverageTestDrive {
    public static void main(String[] args) {

       // TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook=new CoffeeWithHook();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
