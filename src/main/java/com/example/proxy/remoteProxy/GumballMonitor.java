package com.example.proxy.remoteProxy;

import java.rmi.RemoteException;

//GumballMonitor客户端
public class GumballMonitor {
    //依赖此GumballMachineRemote远程接口，而不是具体的类
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        //当我们视图调用哪些最终都要通过网络发生的方法时，我么需要捕获所有可能发生的远程异常
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount()
                    + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
