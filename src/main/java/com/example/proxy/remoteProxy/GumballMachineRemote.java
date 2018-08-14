package com.example.proxy.remoteProxy;

import java.rmi.Remote;//用来做rmiregistry lookup的naming类在java.rmi包中
import java.rmi.RemoteException;

//extends Remote这表示此接口要用来支持远程调用
public interface GumballMachineRemote extends Remote {
    //准备支持的方法，每个都要抛出RemoteException
    //因为每次远程方法调用都必须考虑成“有风险的”
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;

    //返回值将从服务器经过网络运回客户，所以必须是原语类型或可序列化类型
    public State getState() throws RemoteException;
}


