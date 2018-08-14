package com.example.proxy.remoteProxy;

import java.rmi.Naming;

//在RMI register中注册
public class GumballMachineTestDrive  {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {//需要在实例化代码前加上try/catch，因为我们的构造器可能会抛出异常
            count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);

            //我们也添加上对Naming.rebind的调用，用gumballmachine的名字发布GumballMachine的stub
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
