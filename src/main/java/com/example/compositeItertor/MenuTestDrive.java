package com.example.compositeItertor;


public class MenuTestDrive {
    public static void main(String[] args) {
        //先创建所有的菜单对象
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU ", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU ", "Lunch");
        MenuComponent cafMenu = new Menu("CAFE MENU ", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU ", "Dessert of course!");
        //需要一个最顶层的菜单，将它称为allMenus
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        //使用组合的add（）方法，将每个菜单都加入到顶层菜单allMenus中
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafMenu);

        //在这里加入菜单项
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89));
        //然后我们也在菜单中加入另一个菜单，由于菜单和菜单项都是MenuComponent，所以菜单可以顺利的被加入
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 159));

        //在这里加入更多的菜单项
        //将整个菜单层次构造完毕，把它整个交给女招待，你会发现，女招待要将整份菜单
        //打印出来
        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

    }
}
