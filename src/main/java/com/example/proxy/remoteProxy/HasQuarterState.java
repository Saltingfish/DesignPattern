package com.example.proxy.remoteProxy;

import java.util.Random;

public class HasQuarterState implements State {
    private static final long serialVersionUID = 768887299984514010L;
    Random randomWinner = new Random(System.currentTimeMillis());

    //对于State的每个市县，我们都在GumballMachine实例变量前面加上transient关键字，这样就可以高考JVM不要序列化这个字段
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {

    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
//其他方法
