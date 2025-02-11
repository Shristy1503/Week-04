import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.javagenerics.dynamiconlinemarketplace.*;
public class OnlineMarketPlaceTest {
    //create product
    private Catalog catalog;
    private Product<BookCategory> book;
    private Product<ClothingCategory> cloth;

    @BeforeEach
    void setUp() {
        catalog = new Catalog();
        book = new Product<>("Verity", 45, new BookCategory("Book"));
        cloth = new Product<>("Skirt", 12, new ClothingCategory("Clothes"));
    }
    @Test
    void testAddProduct() {
        catalog.addProduct(book);
        catalog.addProduct(cloth);

        // Verify the catalog has 2 products
        assertEquals(2, catalog.products.size());
    }

    @Test
    void testApplyDiscount() {
        ProductUtility.applyDiscount(book, 10); // 10% discount on 45
        ProductUtility.applyDiscount(cloth, 20); // 20% discount on 12

        assertEquals(40.5, book.getPrice());
        assertEquals(9.6, cloth.getPrice());
    }

    @Test
    void testDisplayCatalog() {
        catalog.addProduct(book);
        catalog.addProduct(cloth);
        assertDoesNotThrow(() -> catalog.display());
    }
}
