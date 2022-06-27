public class Main {

    public static void main(String[] args) {
        getInterval(71);
    }

    public static void getInterval(int a) {
        if (a > 49 && a < 101)
            System.out.println("The number "+ a +" contained in the interval");
        else System.out.println("The number "+ a +" is not contained in the interval");
    }
}