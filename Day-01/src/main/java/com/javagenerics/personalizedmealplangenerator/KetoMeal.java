package com.javagenerics.personalizedmealplangenerator;

public class KetoMeal implements MealPlan{
    //override the display mean method
    @Override
    public void displayMeal(){
        System.out.println("This is keto meal.");
    };
}
