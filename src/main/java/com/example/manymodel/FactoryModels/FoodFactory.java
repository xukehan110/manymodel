package com.example.manymodel.FactoryModels;

public class FoodFactory {

    public static Food makeFood(String foodName){

        if(foodName.equals("noodle")){
            Food noodel = new noodle();
            noodel.startMake("noodle");
            return noodel;
        }else if(foodName.equals("chicken")){
            Food chicken = new chicken();
            chicken.startMake("chicken");
            return chicken;
        }else {
            return null;
        }
    }
}
