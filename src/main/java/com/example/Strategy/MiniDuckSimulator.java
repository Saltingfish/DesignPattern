package com.example.Strategy;

/**
 * Created  by kzp on 2018/7/3
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
       /*Duck mallard =new MallarDuck();
        mallard.performQuack();
        mallard.performFly();*/

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
