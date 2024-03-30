package Assignment5.Q2Decorator.UnitTest;

import Assignment5.Q2Decorator.Cheese;
import Assignment5.Q2Decorator.MenuItem;
import Assignment5.Q2Decorator.VeganBurger;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CheeseTest {
    private MenuItem menuItem;
    private Cheese cheese;

    @BeforeEach
    void setUp() {
        menuItem = new VeganBurger(); // For testing, let's assume we're adding cheese to a vegan burger
        cheese = new Cheese(menuItem);
    }

    @Test
    void getDescription() {

        assertEquals("VeganBurger, Cheese", cheese.getDescription()); // Expected description after adding cheese
    }

    @Test
    void getCost() {
        assertEquals(3.0, cheese.getCost(), 0.01); // Assuming VeganBurger base cost is $2.50, adding cheese should make it $3.0
    }
}