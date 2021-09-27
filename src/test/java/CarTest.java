import org.junit.*;
import static org.junit.Assert.*;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception{
        c = new Car();
    }

    @Test
    public void testGetPrice(){
        assertEquals(3000, c.getPrice());
    }

    @Test
    public void testUpgradeSpeed(){
        c.upgradeSpeed();
        assertEquals(120, c.getMaxSpeed());
    }

    @Test
    public void testDowngradeSpeed(){
        c.downgradeSpeed();
        assertEquals(80, c.getMaxSpeed());
    }

    @Test
    public void testGetMaxSpeed(){
        assertEquals(100, c.getMaxSpeed());
    }
}
