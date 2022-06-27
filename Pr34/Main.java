public class Main {

    public static void main(String[] args) {
        closeToTen(0, 20);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        if (abs(10 - abs(a)) < abs(10 - abs(b)))
            System.out.println(a);
        else if (abs(10 - abs(a)) == abs(10 - abs(b)))
            System.out.println(a + " " + b);
        else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}