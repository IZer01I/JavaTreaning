public class Person {
    public static int age = 20;

    public static void adjustAge(int age) {
        System.out.println("🙃 The Age in adjustAge() is " + age);
        Person.age = age + 20;
    }
}