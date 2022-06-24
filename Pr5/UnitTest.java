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
        Main.GetStr(Main.str1);
        assertEquals("Your word: Bebra", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.GetStr(Main.str2);
        assertEquals("Your word: Hello", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.GetStr(Main.str3);
        assertEquals("Your word: Go to the cinema", outContent.toString());}
}