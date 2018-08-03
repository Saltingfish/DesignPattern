package com.example.compositeItertor;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegtarian;
    double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegtarian() {
        return vegtarian;
    }

    public double getPrice() {
        return price;
    }

    public MenuItem(String name, String description, boolean vegtarian, double price) {
        this.name = name;
        this.description = description;
        this.vegtarian = vegtarian;
        this.price = price;
    }

    public void print(){
        System.out.println(" " + getName());
        if(isVegtarian()){
            System.out.println("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("   --"+getDescription());
    }

    public Iterator createIterator(){
    return new NullIterator();
    }
}
