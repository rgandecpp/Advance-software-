package Assignment5.Q2Decorator.UnitTest;

import Assignment5.Q2Decorator.VeganBurger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeganBurgerTest {
    private VeganBurger veganBurger;

    @BeforeEach
    void setUp() {
        veganBurger = new VeganBurger();
    }

    @Test
    void getDescription() {
        assertEquals("VeganBurger", veganBurger.getDescription());  // Check if the description matches
    }

    @Test
    void getCost() {
        assertEquals(2.50, veganBurger.getCost(), 0.01);  // Assuming base price of Vegan Burger is $2.50
    }
}