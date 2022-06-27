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
        Main.names("Ivan","Ivan");
        assertEquals("the names are identical", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.names("Ivan", "Peter");
        assertEquals("", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.names("Ivan", "Oleg");
        assertEquals("Name lengths are equal", outContent.toString());}
}