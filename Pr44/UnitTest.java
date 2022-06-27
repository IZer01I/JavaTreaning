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
        Main.max(1,2, 3, 4);
        assertEquals("max: 4.0\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.max(7,4, 8, 11);
        assertEquals("max: 11.0\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.max(1,1, 1, 1);
        assertEquals("1.0\n", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.max(Double.parseDouble("g"), 1,1,1);}
}