import java.io.PushbackReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name and age separated by space: ");
            String user = scanner.nextLine();

            userInfo(user);

        } catch (Exception e) {
            throw new NumberFormatException();
        }
    }

    public static void userInfo(String user) {

        String[] userMass = user.split(" ");

        for(int i = 0; i < 1; i++)
        {
            int year = Integer.parseInt(userMass[1]);
            if(year < 18)
            {
                System.out.print("grow up more");
            }
        }
    }
}


