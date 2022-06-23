public class Main {
    public static int convertToSeconds(int hour)
    {
        if(hour <= 0) throw new ArithmeticException("Your action is illogical!");

        return hour * 60 * 60;
    }

    public static void main(String[] args) {
        for (int i = 1; i<=6; i += 5)
        {
            System.out.println(convertToSeconds(i));
        }
    }
}