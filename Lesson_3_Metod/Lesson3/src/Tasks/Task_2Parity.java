package Tasks;

import java.util.Scanner;

public class Task_2Parity {

    static public void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int set = in.nextInt();

        parity(set); // Вызываем метод
    }

    // 2- Проверить четное число или нечетное, вернуть boolean результат
    public static void parity(int a) //находим минимальное число
    {

        System.out.println ("Введенное число четное " + ((a % 2 ) == 0));

        if ((a % 2 ) == 0)
        {
            System.out.println ("Введенное число четное " + a);
        } else {
        System.out.println("Введенное число НЕ четное " + a );
        }
    }
}
