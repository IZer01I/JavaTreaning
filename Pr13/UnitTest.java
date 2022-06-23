import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void FirstTest() {assertEquals("printing: bebra", Main.writeToConsole("bebra"));}

    @Test
    public void SecondTest() {assertEquals("printing: Hello world", Main.writeToConsole("Hello world"));}

    @Test
    public void ThirdTest() {assertEquals("printing: Go next", Main.writeToConsole("Go next"));}
}