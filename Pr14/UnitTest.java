import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void FirstTest() {assertEquals(0, Main.convertToSeconds(0));}

    @Test
    public void SecondTest() {assertEquals(18000, Main.convertToSeconds(5));}

    @Test
    public void ThirdTest() {assertEquals(0, Main.convertToSeconds(-2));}
}