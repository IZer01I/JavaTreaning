import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static String test1Name = "Name1";
    static String test2Name = "Name2";
    static String test3Name = "Name3";


    public static void main(String[] args) {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter three names: ");

        try {
            Info(name.readLine(), name.readLine(), name.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void Info(String name1, String name2, String name3) {

        System.out.format("%s + %s + %s = Tru love, yeah-yeah!", name1, name2, name3);
    }
}