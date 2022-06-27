public class Main {

    private static String fullName;

    public static void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        Main.fullName = fullName;
    }

    public static String getName()
    {
        return fullName;
    }

    public static void main(String[] args)
    {
        setName("Tomas", "Smitt");
        System.out.println(getName());
    }
}