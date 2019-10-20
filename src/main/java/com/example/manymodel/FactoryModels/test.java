package com.example.manymodel.FactoryModels;

public class test {

    public static void main(String[] args) {
        Food noodle = FoodFactory.makeFood("noodle");
        ((noodle)noodle).eat();

    }
}
