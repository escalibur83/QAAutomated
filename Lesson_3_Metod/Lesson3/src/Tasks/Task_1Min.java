package Tasks;

import java.util.Scanner;

/*
 - Найти минимальное число из 2 чисел, вернуть минимальное
 */
public class Task_1Min {
    static public void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int set = in.nextInt();
        System.out.println("Введите второе число");
        int set1 = in.nextInt();

        minimum(set, set1);



    }

    // 1 - Найти минимальное число из 2 чисел, вернуть минимальное
    public static void minimum (int a, int b) //находим минимальное число
    {
        if (a>b)
        {
            System.out.println ("Второе введенное число является Минимальным =" + b);
        } else {
            System.out.println("Первое введенное число является Минимальным =" + a);
        }
    }
}
