import java.util.Scanner;

public class Main {

    public static String str1 = "Bebra";
    public static String str2 = "Hello";
    public static String str3 = "Go to the cinema";

    public static void main(String[] args) {
        System.out.print("Enter your word: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        GetStr(str);
    }

    public static void GetStr(String str) {
        System.out.print("Your word: " + str);
    }
}