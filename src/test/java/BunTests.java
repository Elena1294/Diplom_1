import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BunTests {
    private Bun bun;

    @Before
    public void createNewInstance() {
        bun = new Bun("original", 200.0f);
    }

    @Test
    public void getName() {
        String expected = "original";
        String actual = bun.getName();

        assertEquals("Incorrect values bun name", expected, actual);
    }

    @Test
    public void getPrice() {
        float expected = 200.0f;
        float actual = bun.getPrice();

        assertEquals("Incorrect values bun price", expected, actual, 0);
    }
}