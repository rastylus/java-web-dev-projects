package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    Car test_car;
    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }@Test
    public void testInitialGasTankF() {
        assertFalse(test_car.getGasTankLevel() == 0);
    }@Test
    public void testInitialGasTankT() {
        assertTrue(test_car.getGasTankLevel() == 10);
    }
    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void testGasLevelInRange() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
//
//    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasLevelOutOfRange() {
    test_car.drive(501);
    assertEquals(test_car.getGasTankLevel(), 0, .001);
}
//    //TODO: can't have more gas than tank size, expect an exception
    @Test()
    public void testGasOverfillException() {
    assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5),
            "Shouldn't get here, car cannot have more gas in the tank than " +
                    "the size of the tank");
}
}