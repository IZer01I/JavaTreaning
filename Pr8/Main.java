import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Birthday(2004, 7, 7);
    }

    static void Birthday(int year, int month, int day) {
        try {
            if (year <= 0 || month <= 0 || day <= 0)
                System.out.println("date of birth cannot be negative or equal to 0!");
            else {
                String birthday = year + "-" + month + "-" + day;
                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                Date parsingDate;
                try {
                    parsingDate = ft.parse(birthday);
                    System.out.println("My birthday " + parsingDate);
                } catch (ParseException e) {
                    System.out.println("Error " + ft);
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Enter only numbers!");
        }
    }
}
