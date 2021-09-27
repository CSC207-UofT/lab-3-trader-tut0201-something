import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import org.junit.Assert.*;


public class TestingTest {
    Testing t;

    @Before
    public void setUp() throws Exception {
        t = new Testing();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Testing Testing 123", t.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(0, t.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t.upgradeSpeed();
        assertEquals(1, t.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        t.downgradeSpeed();
        assertEquals(0, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(Integer.MAX_VALUE, t.getPrice());
    }
}
