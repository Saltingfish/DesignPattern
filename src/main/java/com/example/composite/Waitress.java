package com.example.composite;


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
}
