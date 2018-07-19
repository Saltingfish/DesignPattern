package com.example.Singleton;


import java.lang.invoke.VolatileCallSite;

/**
 * Created  by kzp on 2018/7/16
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile  static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static  ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    public void fill(){

        if(isEmpty()){
            empty =false;
            boiled=false;
        }
    }
    public  boolean isEmpty(){
        return empty;
    }
}
