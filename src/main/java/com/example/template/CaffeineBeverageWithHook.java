package com.example.template;

/**
 * Created  by kzp on 2018/7/30
 */
public abstract class CaffeineBeverageWithHook {

   void prepareRecipe(){
       boilWater();
       brew();
       pourInCup();
       //hook 钩子
       if(customerWantsCondiments()){
           addCondiments();
       }
   }

     abstract void addCondiments();

     abstract void brew();


      void pourInCup(){
        System.out.println("Pouring int cup");
    };
      boolean customerWantsCondiments(){
        return true;
    };

      void boilWater(){
        System.out.println("Boiling water");
    };

}
