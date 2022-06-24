import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static String test1Name = "Name";
    static String test2Name = "5";
    static String test3Name = "a";


    public static void main(String[] args) {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name: ");

        try {
            Info(name.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void Info(String name) {

        System.out.format("\n" + "\s" + name + " earns $5.000. HA-HA-HA!");
    }
}