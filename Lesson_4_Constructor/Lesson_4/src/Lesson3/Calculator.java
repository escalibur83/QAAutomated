package Lesson3;

public class Calculator {

    public int number;
    public Calculator (int number11) // Конструктор
    {
        System.out.println ("I'm calculator");
        this.number = number11;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return this.number;
    }

    public int sum (int a, int b)
    {
        return a + b;
    }

    public int diff (int a, int b)
    {
        return a - b;
    }

    public double div(int a, int b)
    {
        return a / b;
    }

    public int mylty (int a, int b)
    {
        return a * b;
    }

    public static void print (String operation, double result)
    {
        System.out.println ("The result of the" + operation + " is " + result);
    }

}
