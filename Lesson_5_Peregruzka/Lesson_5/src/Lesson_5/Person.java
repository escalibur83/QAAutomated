package Lesson_5;

public class Person {

    public int age;

    public static final String SAY_HELLO = "Say Hello";

    public void printAge ()
    {
        System.out.println (this.age);
        printHello();
        System.out.println (SAY_HELLO);
    }

    public static void printHello ()
    {
        System.out.println (SAY_HELLO);
    }
}
