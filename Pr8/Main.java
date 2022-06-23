import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2004-07-07";

        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println("My birthday " + parsingDate);
        } catch (ParseException e) {
            System.out.println("Error " + ft);
        }
    }
}