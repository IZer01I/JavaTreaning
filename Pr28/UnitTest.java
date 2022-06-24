import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {

    @Test
    public void FirstTest() {
        Main test = new Main();
        test.setName("someName");
        assertEquals("someName", test.getName());
    }

    @Test
    public void SecondTest() {
        Main test = new Main();
        test.setName("testName");
        assertEquals("testName", test.getName());}

    @Test
    public void ThirdTest() {
        Main test = new Main();
        test.setName("testName2");
        assertEquals("testName2", test.getName());}
}