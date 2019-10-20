package com.example.manymodel.ObserverModel;

public abstract class Observer {
    //订阅的主题
    protected Subject subject;

    //修改方法
    public abstract void update();

}
