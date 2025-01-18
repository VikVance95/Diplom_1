import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    String name = "Булочка с маком";
    float price = 56.99f;
    Bun bun = new Bun(name, price);

    @Test
    public void getNameTest() {
        assertEquals("Неверное название", name, bun.getName());
    }

    @Test
    public void getPriceTest() {
        assertEquals("Неверная цена", price, bun.getPrice(), 0);
    }
}
