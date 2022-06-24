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
        Person.adjustAge(1);
        assertEquals("🙃 The Age in adjustAge() is 1\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Person.adjustAge(0);
        assertEquals("🙃 The Age in adjustAge() is 0\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Person.adjustAge(-1);
        assertEquals("🙃 The Age in adjustAge() is -1\n", outContent.toString());
    }

    @Test(expected = NumberFormatException.class)
    public void fourthTest() {
        Person.adjustAge(Integer.parseInt("x"));
        assertEquals("", outContent.toString());
    }
}