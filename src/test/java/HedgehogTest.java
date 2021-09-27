import org.junit.*;

import static org.junit.Assert.*;

public class HedgehogTest {
    public Hedgehog h;

    @Before
    public void setUp() throws Exception {
        h = new Hedgehog("Sonic", 5);
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, h.getPrice());
    }
}
