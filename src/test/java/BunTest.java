import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {

    private String name;
    private float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getParameters() {
        return new Object[][] {
                {"black bun", -100},
                {"white bun", 40.123456f},
                {"", 0},
                {"Флюоресцентная булка", 988},
                {"Краторная булка", 1255}
        };
    }

    @Test
    public void getNameTest() {
        Bun bun = new Bun(name, price);
        assertEquals("Неверное название", name, bun.getName());
    }

    @Test
    public void getPriceTest() {
        Bun bun = new Bun(name, price);
        assertEquals("Неверная цена", price, bun.getPrice(), 0);
    }
}
