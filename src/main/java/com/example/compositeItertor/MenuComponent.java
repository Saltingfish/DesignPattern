package com.example.compositeItertor;

import java.util.Iterator;

public abstract class MenuComponent {

    //前三个“组合”方法组织在一起，及新增，删除和取得菜单组件
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //后面所有这些事“操作”方法；它们被菜单项使用，其中有一些也可用在菜单上
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    //被菜单和菜单项所实现
    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
