package com.example.manymodel.ObserverModel;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>(16);
    private int status;


    public int getStatus() {
        return status;
    }

    //若订阅内容修改则修改状态
    public void setStatus(int status) {
        this.status = status;
        //通知观察者已经修改状态了
        notifyAllObserver();
    }

    //注册观察者
    public void attach(Observer observer){

        observers.add(observer);
    }

    //遍历并唤起观察者
    public void notifyAllObserver(){

        for (Observer observer : observers){
            observer.update();
        }
    }



}
