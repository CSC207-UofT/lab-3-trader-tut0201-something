import org.junit.*;

import static org.junit.Assert.*;


public class SheepTest {
    Sheep s;

    @Before
    public void setUp() throws Exception {
        s = new Sheep();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bahh!", s.sound());
    }

}
