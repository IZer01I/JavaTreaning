import java.util.ArrayList;
import java.util.List;
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
            System.out.print("Enter the third number: ");
            double c = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the forth number: ");
            double d = Double.parseDouble(scanner.nextLine());

            max(a,b,c,d);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void max(double a, double b, double c, double d) {

        double[] mass = new double[]{a, b, c, d};

        if(a == b && a == c && a == d)
        {
            Random random = new Random();
            int x = random.nextInt(4);
            switch (x) {
                case 0 -> System.out.println(a);
                case 1 -> System.out.println(b);
                case 2 -> System.out.println(c);
                case 3 -> System.out.println(d);
            }
        }

        else {
            for (int i = 0; i < 4; i++) {
                if (mass[0] < mass[i]) {
                    mass[0] = mass[i];
                }
            }
            System.out.println("max: " + mass[0]);
        }
    }
}

