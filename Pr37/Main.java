import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your number: ");
            int number = Integer.parseInt(reader.readLine());

            numberEdit(number);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void numberEdit(int number) {
        if (number > 0) number *= 2;
        else if (number < 0) number += 1;
        else number = 0;

        System.out.println("Edited number: " + number);
    }
}
