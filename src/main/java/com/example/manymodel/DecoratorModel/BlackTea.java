package com.example.manymodel.DecoratorModel;

public class BlackTea extends Beverage {

    @Override
    public String getDecration() {
        return "红茶";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
