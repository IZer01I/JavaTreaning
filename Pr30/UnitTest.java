import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {

    @Test
    public void FirstTest() {
        Main test = new Main();
        test.setcatsCount(5);
        assertEquals(5, test.getcatsCount());
    }

    @Test
    public void SecondTest() {
        Main test = new Main();
        test.setcatsCount(1);
        assertEquals(1, test.getcatsCount());
    }

    @Test
    public void ThirdTest() {
        Main test = new Main();
        test.setcatsCount(10);
        assertEquals(10, test.getcatsCount());
    }
}