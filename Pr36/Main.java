public class Main {

    public static void main(String[] args) {
        checkSeason(1);
    }

    public static void checkSeason(int month) {
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }
}