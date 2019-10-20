package com.example.manymodel.DecoratorModel;

public class Lome extends Condiment {
    private Beverage bevarage;

    public Lome(Beverage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDecration() {
        return bevarage.getDecration() + ", 加柠檬";
    }

    @Override
    public int getCost() {
        return bevarage.getCost() + 2; // 加柠檬需要 2 元
    }
}