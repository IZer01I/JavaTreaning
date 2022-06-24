import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void FirstTest() {assertEquals(350, Apple.addPrice(100));}

    @Test
    public void SecondTest() {assertEquals(200, Apple.addPrice(200));}

    @Test
    public void ThirdTest() {assertEquals(250, Apple.addPrice(50));}
}