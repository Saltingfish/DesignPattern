package com.example.proxy.remoteProxy;


import java.io.Serializable;

//扩展Serializable接口，使得State可序列化
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
