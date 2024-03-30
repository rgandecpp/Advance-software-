package Assignment5.Q2Decorator.UnitTest;

import Assignment5.Q2Decorator.HotDog;
import Assignment5.Q2Decorator.Ketchup;
import Assignment5.Q2Decorator.MenuItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KetchupTest {
    private MenuItem menuItem;

    @BeforeEach
    void setUp() {
        menuItem = new HotDog(); // For testing, let's assume we're adding ketchup to a hot dog
    }

    @Test
    void getDescription() {
        Ketchup ketchup = new Ketchup(menuItem);
        assertEquals("HotDog, Ketchup", ketchup.getDescription()); // Expected description after adding ketchup
    }

    @Test
    void getCost() {
        Ketchup ketchup = new Ketchup(menuItem);
        assertEquals(3.80, ketchup.getCost(), 0.01); // Assuming HotDog base cost is $3.60, adding ketchup should make it $3.80
    }
}