import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Money(Integer.parseInt(reader.readLine()));
        } catch (Exception e) {
            System.out.println("you need to enter a number!");
        }
    }

    public static void Money(int money) {
        System.out.format("I will earn $%s per hour", money);
    }
}
