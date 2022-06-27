import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {

    @Test
    public void FirstTest() {
        Main.setName("5","1");
        assertEquals("5 1", Main.getName());
    }

    @Test
    public void SecondTest() {
        Main.setName("Jerry","jaxen");
        assertEquals("Jerry jaxen", Main.getName());
    }

    @Test
    public void ThirdTest() {
        Main.setName("0", "1");
        assertEquals("0 1", Main.getName());
    }
}