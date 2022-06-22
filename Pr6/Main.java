import java.util.Scanner;

import static java.lang.System.in;

public class Main
{
    public static double test1 = 5;
    public static double test2 = -1;
    public static double test3 = 0.5;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sum: ");
        double sum = Double.parseDouble(scanner.nextLine());

        System.out.println(sum + " Eur = " + convertEurToUsd( sum, 1.15) + " Usd");
    }

    public static String convertEurToUsd(double eur, double course)
    {
        try
        {
            if(eur <= 0) return "you need to enter an amount greater than 0";

            return String.valueOf(eur * course);
        }
        catch (Exception ex)
        {
          return ex.getMessage();
        }
    }
}
