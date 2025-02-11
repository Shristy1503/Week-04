package com.javagenerics.personalizedmealplangenerator;

public class VeganMeal implements MealPlan{
    //override the display mean method
    @Override
    public void displayMeal(){
        System.out.println("This is vegan meal.");
    };
}
