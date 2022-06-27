import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the second number: ");
            double b = Double.parseDouble(scanner.nextLine());

           min(a, b);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void min(double a, double b) {
        if (a < b)
        {
            System.out.println("min: " +  a);
        }
        else if (b < a)
        {
            System.out.println("min: " +  b);
        }
        else {
            Random random = new Random();
            int x = random.nextInt(2);

            if (x == 0) System.out.println(a);
            else System.out.println(b);
        }
    }
}

