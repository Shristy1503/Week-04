package com.javagenerics.personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class MealUtility {
 //generic method
 public static <T extends MealPlan> Meal<T> createMealPlan(T meal) {
     return new Meal<>(meal);
 }
}
