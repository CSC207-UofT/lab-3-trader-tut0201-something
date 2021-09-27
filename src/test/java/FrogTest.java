import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogTest {
    Frog f;

    @Before
    public void setUp() throws Exception {
        f = new Frog();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Ribbit", f.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(3, f.getPrice());
    }

    @Test(timeout = 50)
    public void isHappy() {
        assertEquals("The frog is happy! But now you've poked him and he's sad.",
                f.isHappy());
        assertEquals("The frog is sad. But now he's feeling a bit better.",
                f.isHappy());
        assertEquals("The frog is happy! But now you've poked him and he's sad.",
                f.isHappy());
    }
}