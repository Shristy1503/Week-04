package com.javagenerics.personalizedmealplangenerator;
//genetic class with T
public class Meal <T extends MealPlan>{
    private T meal;

    //constructor
    public Meal(T meal){
        this.meal = meal;
    }
    // method to generate meal
    public T getMeal(){
        return meal;
    }
    public void generate(){
        meal.displayMeal();
    }
}
