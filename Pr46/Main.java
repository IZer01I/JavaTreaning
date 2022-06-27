import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first name: ");
            String name1 = scanner.nextLine();
            System.out.print("Enter the second name: ");
            String name2 = scanner.nextLine();

            names(name1, name2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void names(String a, String b) {

        if(a.equals(b)) System.out.print("the names are identical");
        else if(a.length() == b.length()) System.out.print("Name lengths are equal");
    }
}


