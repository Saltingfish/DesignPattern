package com.example.adapter;

/**
 * Created  by kzp on 2018/7/26
 */
public class MallandDuck implements Duck
{
    @Override
    public void fly() {
        System.out.println("MallabdDuck:fly");
    }

    @Override
    public void jiao() {
        System.out.println("MallabdDuck:jiao");

    }
}
