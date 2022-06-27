import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the time: ");
            double time = Double.parseDouble(scanner.nextLine());

           calculationTrafficLightTimings(time);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void calculationTrafficLightTimings(double time) {
        time = abs(time);
        if((int)time % 5 < 3){ System.out.print("green"); }
        else if((int)time % 5 < 4){ System.out.print("yellow"); }
        else{System.out.print("red");}
    }
}

