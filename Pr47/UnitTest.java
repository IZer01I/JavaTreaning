import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void FirstTest() {
        Main.userInfo("Ivan 19");
        assertEquals("", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.userInfo("Ivan 10");
        assertEquals("grow up more", outContent.toString());
    }

    @Test(expected = NumberFormatException.class)
    public void ThirdTest() {
        Main.userInfo("Ivan r");
        assertEquals("", outContent.toString());}
}