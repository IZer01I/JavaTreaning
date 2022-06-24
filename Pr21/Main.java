import java.util.Scanner;

public class Main {

    static String test1Name = "Name";
    static int test1Number = 5;
    static int test2Number = -5;
    static String test3Number = "a";


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter name: ");

            String name = scanner.nextLine();
            System.out.print("\nEnter first number: ");
            int fN = Integer.parseInt(scanner.nextLine());
            System.out.print("\nEnter second number: ");
            int sN = Integer.parseInt(scanner.nextLine());

            Info(name, fN, sN);
        } catch (NumberFormatException ex) {
            System.out.println("letters can only be entered in the name!");
        }
    }

    static void Info(String name, int firstNumber, int secondNumber) {

        System.out.println("\n" + name + " gets " + firstNumber + " in " + secondNumber + " years");
    }
}