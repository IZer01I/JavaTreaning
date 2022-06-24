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
        Main.Info(Main.test1Name, Main.test1Number,Main.test1Number );
        assertEquals("\n" +
                "Name gets 5 in 5 years\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.Info(Main.test1Name, Main.test2Number,Main.test2Number );
        assertEquals("\n" +
                "Name gets -5 in -5 years\n", outContent.toString());
    }

    @Test(expected = NumberFormatException.class)
    public void ThirdTest() {
        Main.Info(Main.test1Name, Integer.parseInt(Main.test3Number), Integer.parseInt(Main.test3Number));
        assertEquals("", outContent.toString());}
}