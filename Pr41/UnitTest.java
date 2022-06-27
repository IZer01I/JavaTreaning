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
        Main.calculationTrafficLightTimings(8);
        assertEquals("yellow", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.calculationTrafficLightTimings(400);
        assertEquals("green", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.calculationTrafficLightTimings(4);
        assertEquals("red", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.calculationTrafficLightTimings(Double.parseDouble("g"));
        assertEquals("", outContent.toString());}
}