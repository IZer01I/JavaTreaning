import java.util.Scanner;

public class Main {
    public static double test1 = 5;
    public static double test2 = -10;
    public static double test3 = 0;

    public static void main(String[] args) {
        System.out.println("Increasing the number by 10% ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput number: ");
        try {
            double number = Double.parseDouble(scanner.nextLine());

            System.out.println("Answer: " + tenPercent(number));
        } catch (NumberFormatException ex) {
            System.out.println("Why do you want to get a percentage of word?");
        }
    }

    public static double tenPercent(double number) {
        if (number != 0)
            return (number + number / 10);
        else throw new ArithmeticException("Why do you want to get a percentage of 0?");
    }
}
