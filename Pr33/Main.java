public class Main {

    public static void main(String[] args) {
        compare(1);
        compare(5);
        compare(10);
    }

    public static void compare(int a) {
        if (a < 5)
            System.out.println("number less than 5");
       else if (a > 5)
            System.out.println("number greater than 5");
        else
            System.out.println("number is 5");
    }
}