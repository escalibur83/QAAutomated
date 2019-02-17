package Lesson3;

public class Example {

    public static void main (String[] args)
    {
        Calculator calculator1 = new Calculator(1); //метод1
        Calculator calculator2 = new Calculator(2); //метод2

        calculator1.setNumber(5);
        System.out.println (calculator1.getNumber());

        calculator2.setNumber(6);
        System.out.println (calculator2.getNumber());

        calculator1.print(" blabla", 5);
        calculator1.print(" blablabla", calculator1.sum(2, 3));

        //int result = calculator1.sum(5, 6);
        //System.out.println (result);

        //System.out.println (calculator2.sum(5,4));

    }
}
