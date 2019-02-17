package Lesson3;

import java.util.Scanner;

public class Calculator1 {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();

        finalResult(a, b);
    }

    public static void getSum(int a, int b) {
        System.out.println ("The result of the operation getSum is " + a + b);
    }

    public static void getDiff(int a, int b) {
        System.out.println ("The result of the operation getSum is " + (a - b));
    }

    public static void getPartit (double a, double b) {

        if (b != 0) {
            double c = a / b;
            System.out.println ("The result of the operation getSum is " + c);
        } else {
            System.out.println ("Делить на 0 нельзя");
        }
    }

    public static void finalResult(int a, int b) {
        getSum(a, b);
        getDiff(a, b);
        getPartit(a, b);
    }
}
