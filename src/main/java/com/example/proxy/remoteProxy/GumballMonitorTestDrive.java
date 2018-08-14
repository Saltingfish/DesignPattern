package com.example.proxy.remoteProxy;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://seattle.mightygumball.com/gumballmachine"};

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                //为每个远程机器创建一个代理，客户从Register中寻找代理，也就是stub对象
                GumballMachineRemote machine = (GumballMachineRemote) Naming
                        .lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //遍历每台机器，打印报告
        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }

}
