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
        Main.sort(1,2, 3);
        assertEquals("3 2 1 ", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.sort(17,-4, 8);
        assertEquals("17 8 -4 ", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.sort(1, 1, 1);
        assertEquals("1 1 1 ", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.sort(Integer.parseInt("g"), 1,1);}
}