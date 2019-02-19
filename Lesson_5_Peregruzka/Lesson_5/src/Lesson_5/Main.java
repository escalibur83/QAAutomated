package Lesson_5;

public class Main {
    public static void main (String[] args)
    {
        System.out.println (Person.SAY_HELLO);
        Person.printHello();

        Person p1 = new Person();
        p1.printAge();
        p1.printHello ();

        int age = p1.age;

        Square square1 = new Square();

        System.out.println (square1.getPerimetr(3));
        System.out.println (square1.getSquare(4));

        System.out.println (square1.getSquare(4 ));
        System.out.println (square1.getPerimetr(5));

        System.out.println (square1.getPerimetr(6,5,6));
        System.out.println (square1.getSquare(4,8));

        Persone1 persone11 = new Persone1(1);
        persone11.printAll();

        Persone1 persone12 = new Persone1 (1, "Sasha");
        persone12.printAll();

        Persone1 persone13 = new Persone1 (1, "Vasia", 33);
        persone13.printAll();
    }



}
