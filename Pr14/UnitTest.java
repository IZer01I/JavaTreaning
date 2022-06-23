import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test(expected = ArithmeticException.class)
    public void FirstTest() {assertEquals("Your action is illogical!", Main.convertToSeconds(0));}

    @Test
    public void SecondTest() {assertEquals(18000, Main.convertToSeconds(5));}

    @Test(expected = ArithmeticException.class)
    public void ThirdTest() {assertEquals("Your action is illogical!", Main.convertToSeconds(-2));}
}