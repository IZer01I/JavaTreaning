import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the number of the day of the week: ");
            int number = Integer.parseInt(reader.readLine());

            dayOfTheWeek(number);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void dayOfTheWeek(int dayNumber) {
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("this number is not the day of the week!");
        }
    }
}

