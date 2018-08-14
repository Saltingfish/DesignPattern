package com.example.proxy.remoteProxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//GumballMachine 要继承UnicastRemoteObject成为一个远程服务
//GumballMachine 也需要实现GumballMachineRemote这个远程接口
public class GumballMachine extends UnicastRemoteObject implements
        GumballMachineRemote {
    /**
     *
     */
    private static final long serialVersionUID = -2838970117227273571L;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state = soldOutState;
    int count = 0;
    String location;

    //构造器需要抛出RemoteException，因为超类是这样做的
    public GumballMachine(String location, int numberGumballs)
            throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0)
            state = noQuarterState;
        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    //其他方法
}


