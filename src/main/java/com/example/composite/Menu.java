package com.example.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    //菜单可以有任意数目的孩子，这些孩子都必须属于 MenuComponent,我们使用内部的ArrayList记录它们
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //我们在这里将菜单项和其他菜单加入菜单中。因为菜单和菜单项都是MenuComponent,
    //所以我们只需用一个方法就可以二者兼顾
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //被菜单和菜单项所实现
    public void print() {
        System.out.println("\n " + getName());
        System.out.println(", " + getDescription());
        System.out.println("--------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
