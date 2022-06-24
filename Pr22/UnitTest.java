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
        Main.Info(Main.test1Name);
        assertEquals("\n" +
                " Name earns $5.000. HA-HA-HA!", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.Info(Main.test2Name);
        assertEquals("\n" +
                " 5 earns $5.000. HA-HA-HA!", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.Info(Main.test3Name);
        assertEquals("\n" +
                " a earns $5.000. HA-HA-HA!", outContent.toString());}
}