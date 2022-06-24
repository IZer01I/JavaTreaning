public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=6; i += 5)
        {
            System.out.println(convertToSeconds(i));
        }
    }

    public static int convertToSeconds(int hour)
    {
        if(hour <= 0) return 0;

        return hour * 60 * 60;
    }
}