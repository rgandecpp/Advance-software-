package Assignment5.Q2Decorator.UnitTest;

import Assignment5.Q2Decorator.SoftDrink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SoftDrinkTest {
    private SoftDrink smallSoftDrink;
    private SoftDrink mediumSoftDrink;
    private SoftDrink largeSoftDrink;

    @BeforeEach
    void setUp() {
        smallSoftDrink = new SoftDrink("small");
        mediumSoftDrink = new SoftDrink("medium");
        largeSoftDrink = new SoftDrink("large");
    }

    @Test
    void getDescriptionSmall() {
        assertEquals("small Soft Drink", smallSoftDrink.getDescription()); // Expected description for small size
    }

    @Test
    void getDescriptionMedium() {
        assertEquals("medium Soft Drink", mediumSoftDrink.getDescription()); // Expected description for medium size
    }

    @Test
    void getDescriptionLarge() {
        assertEquals("large Soft Drink", largeSoftDrink.getDescription()); // Expected description for large size
    }

    @Test
    void getCostSmall() {
        assertEquals(1.00, smallSoftDrink.getCost(), 0.01); // Expected cost for small size
    }

    @Test
    void getCostMedium() {
        assertEquals(1.25, mediumSoftDrink.getCost(), 0.01); // Expected cost for medium size
    }

    @Test
    void getCostLarge() {
        assertEquals(1.50, largeSoftDrink.getCost(), 0.01); // Expected cost for large size
    }
}