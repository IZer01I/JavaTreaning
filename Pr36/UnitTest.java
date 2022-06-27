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
        Main.checkSeason(1);
        assertEquals("Winter\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.checkSeason(4);
        assertEquals("Spring\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.checkSeason(7);
        assertEquals("Summer\n", outContent.toString());}

    @Test
    public void FourthTest() {
        Main.checkSeason(10);
        assertEquals("Autumn\n", outContent.toString());}
}