package com.example.adapter;

/**
 * Created  by kzp on 2018/7/26
 */
public class WildTurkey implements Turkey
{
    @Override
    public void gobble() {
        System.out.println("WildTurkey:gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey:fly");
    }


}
