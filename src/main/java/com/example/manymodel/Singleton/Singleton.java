package com.example.manymodel.Singleton;


//恶汉单例模式
public class Singleton {

    //断了外部new Singleton()方式
    private Singleton(){};

    //类第一次使用时创建对象
    private static Singleton singleton = new Singleton();

    //外部获取实例的方式
    public static Singleton getInstance(){
        return singleton;
    }
}
