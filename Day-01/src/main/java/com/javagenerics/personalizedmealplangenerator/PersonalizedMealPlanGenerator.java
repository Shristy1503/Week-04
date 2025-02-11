package com.javagenerics.personalizedmealplangenerator;

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
     // generate meal of each type
     Meal<VegetarianMeal> vegetarianMealMeal = MealUtility.createMealPlan(new VegetarianMeal());
     vegetarianMealMeal.generate();

     Meal<VeganMeal> veganMealMeal = MealUtility.createMealPlan(new VeganMeal());
     veganMealMeal.generate();

     Meal<KetoMeal> ketoMealMeal = MealUtility.createMealPlan(new KetoMeal());
     ketoMealMeal.generate();

     Meal<HighProteinMeal> highProteinMealMeal = MealUtility.createMealPlan(new HighProteinMeal());
     highProteinMealMeal.generate();
    }
}
