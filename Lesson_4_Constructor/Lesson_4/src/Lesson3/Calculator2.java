package Lesson3;

public class Calculator2 {
    public static void main (String[] args)
    {
        int resurt = sum(3, 2);

        System.out.println (resurt);

        System.out.println (diff(10, 2));

        System.out.println (div(10, 2));

        System.out.println (mylty(10, 2));

        print("sum", sum(3, 2));

        print("div", div(3, 2));

        print("diff", diff(3, 2));

        print("multy", mylty(3, 2));

    }

    public static int sum (int a, int b)
    {
        return a + b;
    }

    public static int diff (int a, int b)
    {
        return a - b;
    }

    public static double div(int a, int b)
    {
        return a / b;
    }

    public static int mylty (int a, int b)
    {
        return a * b;
    }

    public static void print (String operation, double result)
    {
        System.out.println ("The result of the" + operation + " is " + result);
    }

}
