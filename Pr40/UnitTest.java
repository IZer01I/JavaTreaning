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
        Main.triangleCalculation(5, 2,1);
        assertEquals("Triangle is not exists\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.triangleCalculation(400, 400, 400);
        assertEquals("Triangle exists\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.triangleCalculation(-1, 2,1);
        assertEquals("Triangle is not exists\n", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.triangleCalculation(Double.parseDouble("g"), 2,1);
        assertEquals("", outContent.toString());}
}