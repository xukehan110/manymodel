package com.example.manymodel.DecoratorModel;

public class test {
    public static void main(String[] args) {

        Beverage beverage = new BlackTea();

        beverage = new Lome(beverage);

        System.out.println(beverage.getDecration());

        System.out.println(beverage.getCost());

    }
}
