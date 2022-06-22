public class Main {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static String getVolume(int a, int b, int c) {

          double x = (a * b * c) * 1000;
        if(x <= 0) return "pool volume cannot be less than or equal to 0";
        else return ("pool volume: " + x);
    }
}
