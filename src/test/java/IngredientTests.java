import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
public class IngredientTests {
    private Ingredient ingredient;
    @Before
    public void createNewInstance() {
        ingredient = new Ingredient(IngredientType.SAUCE, "chili", 20.0f);
    }
    @Test
    public void getName() {
        String expected = "chili";
        String actual = ingredient.getName();

        assertEquals("Incorrect values ingredient name", expected, actual);
    }
    @Test
    public void getPrice() {
        float expected = 20.0f;
        float actual = ingredient.getPrice();
        assertEquals("Incorrect values ingredient price", expected, actual, 0);
    }
}