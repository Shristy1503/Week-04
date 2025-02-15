package commonproblemtests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import commonproblems.implementashoppingcart.*;
import java.util.Map;
public class ShoppingCartTest {


        @Test
        void testAddToCart() {
            assertDoesNotThrow(() -> {
                ImplementShoppingCart.addProduct("Apple", 3);
                ImplementShoppingCart.addProduct("Milk", 2);
            });
        }



    @Test
    void testDisplaySortedByPrice() {
        ImplementShoppingCart.addProduct("Apple", 3);
        ImplementShoppingCart.addProduct("Milk", 2);
        assertDoesNotThrow(() -> ImplementShoppingCart.displaySortedCart());
    }

    @Test
    void testDisplayAll() {
        ImplementShoppingCart.addProduct("Orange", 4);
        ImplementShoppingCart.displayAllProducts();
    }

}
