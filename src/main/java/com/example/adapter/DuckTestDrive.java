package com.example.adapter;

/**
 * Created  by kzp on 2018/7/26
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        //创建鸭子
        MallandDuck duck = new MallandDuck();
        //创建火鸡
        WildTurkey turkey = new WildTurkey();
        //将火鸡包装进一个火鸡适配器中，使他看起来像是一只鸭子
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


        System.out.println("The Turkey says..");


        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says..");
        testDuck(duck);


        System.out.println("\nThe TurkeyAdapter says..");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.jiao();
        duck.fly();

    }

}
