import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientParameterizedTest {

    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientParameterizedTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Ингридиент {1} типа {0} за {2} денег")
    public static Object[][] data() {
        return new Object[][] {
                {FILLING, "chili sauce", 100},
                {SAUCE, "hot sauce", 150},
                {null, "cutlet", 100},
                {FILLING, "cutlet", 100},
                {FILLING, "sausage", 300},
                {SAUCE, "sour cream", 200},
                {FILLING, "", 0},
        };
    }

    @Test
    public void getPriceTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ожидалась другая цена", price, ingredient.getPrice(), 0);
    }

    @Test
    public void getNameTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ожидалось другое название ингредиента", name, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ожидался другой тип ингредиента", type, ingredient.getType());
    }
}
