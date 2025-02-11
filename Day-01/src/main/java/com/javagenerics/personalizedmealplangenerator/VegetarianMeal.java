package com.javagenerics.personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan{
    //override the display mean method
    @Override
    public void displayMeal(){
        System.out.println("This is vegetarian meal.");
    };
}
