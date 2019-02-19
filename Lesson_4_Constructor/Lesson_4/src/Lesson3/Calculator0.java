package Lesson3;

import java.util.Scanner;

public class Calculator0 {

        static public void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = in.nextInt();
            System.out.println("Введите второе число");
            int b = in.nextInt();

            finalResult(a, b);
        }

        public static int getSum(int a, int b) {
            return a + b;
        }

        public static int getDiff(int a, int b) {
            return a - b;
        }

        public static double getPartit(double a, double b) {

            if (b != 0) {
                double c = a / b;
                return c;
            } else {
                return 0;
            }
        }

        public static void finalResult(int a, int b) {
            System.out.println("The result of the operation \"getSum(a, b)\" is " + getSum(a, b));
            System.out.println("The result of the operation \"getDiff(a, b)\" is " + getDiff(a, b));
            System.out.println("The result of the operation \"getPartit(a, b)\" is " + getPartit(a, b));
        }
}
