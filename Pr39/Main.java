import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the year: ");
            int year = Integer.parseInt(reader.readLine());

            yearInfo(year);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void yearInfo(int year) {
        if (year < 0){ System.out.println("Negative year?");}
       else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Number of days in a year: " + 366);
        } else {
            System.out.println("Number of days in a year: " + 365);
        }
    }
}

