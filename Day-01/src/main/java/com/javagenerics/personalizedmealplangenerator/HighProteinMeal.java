package com.javagenerics.personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan{
    //override the display mean method
    @Override
    public void displayMeal(){
        System.out.println("This is high protein meal.");
    };
}
