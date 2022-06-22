import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("format month number. year");
        System.out.println("e.g. July 7. 2004");
        System.out.print("\nWrite your date of birth: ");

        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();

        System.out.println("Congratulation! your birthday " + birthday);
    }
}
