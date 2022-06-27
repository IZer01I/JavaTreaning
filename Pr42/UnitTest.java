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
        Main.findCouple(8,1,2);
        assertEquals("", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.findCouple(1,1,2);
        assertEquals("1.0 1.0\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.findCouple(1,1,1);
        assertEquals("1.0 1.0 1.0\n", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.findCouple(Double.parseDouble("g"), 1, 1);
        assertEquals("", outContent.toString());}
}