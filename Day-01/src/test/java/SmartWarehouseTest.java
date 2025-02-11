import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.javagenerics.smartwarehousemanagementsystem.*;
import java.util.List;
public class SmartWarehouseTest {
     //create storage
     private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;
    @BeforeEach
    void setUp() {
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }
    //testing for groceries storage
    @Test
    void testAddAndRetrieveGroceries() {
        Groceries banana = new Groceries("Banana", 1.99);
        groceriesStorage.addItem(banana);

        List<Groceries> items = groceriesStorage.getItem();
        assertEquals(1, items.size());
        assertEquals("Banana", items.get(0).getName());
        assertEquals(1.99, items.get(0).getPrice());
    }
    //testing for furniture storage
    @Test
    void testAddAndRetrieveFurniture() {
        Furniture chair = new Furniture("Chair", 85.75);
        furnitureStorage.addItem(chair);

        List<Furniture> items = furnitureStorage.getItem();
        assertEquals(1, items.size());
        assertEquals("Chair", items.get(0).getName());
        assertEquals(85.75, items.get(0).getPrice());
    }
}
