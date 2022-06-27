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
        Main.dayOfTheWeek(5);
        assertEquals("Friday\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.dayOfTheWeek(0);
        assertEquals("this number is not the day of the week!\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.dayOfTheWeek(1);
        assertEquals("Monday\n", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.dayOfTheWeek(Integer.parseInt("g"));
        assertEquals("", outContent.toString());}
}