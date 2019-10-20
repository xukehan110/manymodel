package com.example.manymodel.ObserverModel;

public class test {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);

        new HexaObserver(subject);
        
        subject.setStatus(11);

    }

}
