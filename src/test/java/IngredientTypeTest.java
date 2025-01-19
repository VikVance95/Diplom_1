import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertNotNull;

public class IngredientTypeTest {

    @Test
    public void sauceTest() {
        assertNotNull("Начинки не указаны в ингредиентах", IngredientType.valueOf("FILLING"));
    }

    @Test
    public void fillingTest() {
        assertNotNull("Соусы не указаны в ингредиентах", IngredientType.valueOf("SAUCE"));
    }
}
