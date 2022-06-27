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

           findCouple(a, b, c);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void findCouple(double a, double b, double c) {
        String result = "";

        if (a == b) {
            result += a + " " + b + (a == c ? " " + c : "");
        } else if (b == c) {
            result += b + " " + c + (a == c ? " " + a : "");
        } else if (c == a) {
            result += c + " " + a + (b == c ? " " + b : "");
        }

        if (!result.isEmpty()) {
            System.out.println(result);
        }
    }
}

