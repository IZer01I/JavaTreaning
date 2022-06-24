import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)
    {

        for(int i = 1; i < 11; i++) {
            Zerg Zerg = new Zerg("Zerg" + i);
        }


        for(int i = 1; i < 6; i++) {
            Protoss Protoss = new Protoss("Protoss" + i);
        }


        for(int i = 1; i < 11; i++) {
            Terran Terran = new Terran("Terran" + i);
        }
    }
}