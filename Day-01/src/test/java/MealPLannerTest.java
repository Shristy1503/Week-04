import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.javagenerics.personalizedmealplangenerator.*;
public class MealPLannerTest {
    @Test
    //test for vegan meal
    void testGenerateMealPlanForVegan() {
        VeganMeal veganMeal = new VeganMeal();
        Meal<VeganMeal> meal = MealUtility.createMealPlan(veganMeal);

        assertNotNull(meal);
        assertEquals(veganMeal, meal.getMeal());
    }
    @Test
    //test for vegetarian
    void testGenerateMealPlanForVegetarian() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        Meal<VegetarianMeal> meal = MealUtility.createMealPlan(vegetarianMeal);

        assertNotNull(meal);
        assertEquals(vegetarianMeal, meal.getMeal());
    }
}
