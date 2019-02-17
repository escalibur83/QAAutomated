package Tasks;

import java.util.Scanner;

public class Task_3Square {

    static public void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int set = in.nextInt();

        square(set); // Вызываем метод
    }

    // 3- Возвести число в квадрат, вернуть результат возведения
    public static void square(int a) //возводим число в квадрат
    {

        System.out.println ("Квадрат числа " + a + " равен " + (a*a));
    }
}
