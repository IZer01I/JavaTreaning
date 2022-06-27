import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the second number: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the third number: ");
            int c = Integer.parseInt(scanner.nextLine());

            sort(a, b, c);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void sort(int a, int b, int c) {

        LinkedList<Integer> numberList = new LinkedList<>();

        numberList.add(a);
        numberList.add(b);
        numberList.add(c);

        numberList.sort(Collections.reverseOrder());

        for (Integer integer : numberList) {
            System.out.print(integer + " ");
        }
    }
}


