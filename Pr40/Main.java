import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the first triangle side: ");
            double a = Integer.parseInt(reader.readLine());
            System.out.print("Enter the second triangle side: ");
            double b = Integer.parseInt(reader.readLine());
            System.out.print("Enter the third triangle side: ");
            double c = Integer.parseInt(reader.readLine());

           triangleCalculation(a,b,c);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void triangleCalculation(double a, double b, double c) {
        if(a <= 0 || b <= 0 || c <= 0) System.out.println("Triangle is not exists");
        else if(a + b > c && a + c > b && c + b > a) System.out.println("Triangle exists");
        else System.out.println("Triangle is not exists");
    }
}

