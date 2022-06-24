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
        Main.Info(Main.test1Name, Main.test1Year);
        assertEquals("\n" +
                "Name will take over the world in 5 years. Mu-ha-ha!\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.Info(Main.test1Name, Main.test2Year);
        assertEquals("Why would you enter a negative number?\n", outContent.toString());
    }

    @Test(expected = NumberFormatException.class)
    public void ThirdTest() {
        Main.Info(Main.test1Name, Integer.parseInt(Main.test3Year));
        assertEquals("Why would you enter a negative number?\n", outContent.toString());}
}