package com.example.manymodel.ObserverModel;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String result = Integer.toBinaryString(subject.getStatus());
        System.out.println("订阅的数据发生变化，新的数据处理为二进制值为：" + result);
    }
}
