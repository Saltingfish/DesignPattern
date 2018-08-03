package com.example.compositeItertor;


import java.util.Iterator;

public class Waitress {
    MenuComponent allmenus;

    //最顶层菜单包含其他所有的菜单，称之为allMenus
    public Waitress(MenuComponent allmenus) {
        this.allmenus = allmenus;
    }

    //外部只需要调用最顶层的菜单print()，就可以打印整个菜单层次，包括所有菜单及所有菜单项
    public void printMenu() {
        allmenus.print();
    }


    public void printVegetarianMenu() {
        //printVegetarianMenu 方法取得allMenu's的组合并得到他的迭代器来作为我们的CompositeIterator
        Iterator iterator = allmenus.createIterator();
        System.out.println("\nVEGETARIAN MENU-----");
        //遍历组合内的每个元素
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    //调用每个元素isVegetarian()方法，如果为true,就调用他的print()方法。
                    menuComponent.print();
                }
            }catch (UnsupportedClassVersionError e){
                //只有菜单项的print()方法可以被调用，绝对不能调用菜单（组合）的print（)方法
            }
        }
    }

}
