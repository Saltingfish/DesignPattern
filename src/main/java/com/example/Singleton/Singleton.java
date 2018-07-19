package com.example.Singleton;

/**
 * Created  by kzp on 2018/7/16
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton(){}

    public  static Singleton getInstance(){// 检查实例，如果不存在就进入同步块
        if (uniqueInstance==null){//注意：只有第一次才彻底执行这里的代码
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();//进入区块后，在检查一次，如果仍是null，才创建实例
                }
            }
        }return uniqueInstance;
    }
}
//volatile 当uniqueInstance变量被初始化成Singlton实例时，多个线程正确当处理
//uniqueInstance变量