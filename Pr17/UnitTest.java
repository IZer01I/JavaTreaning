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
        Main.outM();
        assertEquals("red\n" +
                "green\n" +
                "blue\n" +
                "orange\n" +
                "yellow\n" +
                "gray\n" +
                "pink\n", outContent.toString());
    }
}