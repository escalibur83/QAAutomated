package Tasks;

import java.util.Scanner;

public class Task_4Cube {

    static public void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int set = in.nextInt();

        cube(set); // Вызываем метод
    }

    // 3- Возвести число в куб, вернуть результат возведения
    public static void cube(int a) //возводим число в квадрат
    {

        System.out.println ("Число " + a + " в кубе, равно " + (a*a*a));
    }
}
