public class Main {
    public static void main(String[] args) {
        System.out.println("pool volume: " + getVolume(25, 5, 2));
    }

    public static int getVolume(int a, int b, int c) {
        int x = (a * b * c) * 1000;
        if (a <= 0 || b <= 0 || c <= 0) throw new ArithmeticException("pool volume cannot be less than or equal to 0");
        else return x;
    }
}
