import java.util.Scanner;

public class Main {

    static String test1Name = "Name";
    static int test1Year = 5;
    static int test2Year = -5;
    static String test3Year = "a";


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");

            String name = scanner.nextLine();
            System.out.print("\nEnter year: ");
            int year = Integer.parseInt(scanner.nextLine());

            Info(name, year);
        } catch (NumberFormatException ex) {
            System.out.println("Years needs enter in numbers!");
        }
    }

    static void Info(String name, int year) {

            System.out.println("\n" + name + " will take over the world in " + year + " years. Mu-ha-ha!");
    }
}