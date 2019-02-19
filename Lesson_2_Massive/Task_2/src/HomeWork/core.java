package HomeWork;
/*
Обычное задание
Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива задан, заполнить его одним из двух способов (или используя mas[i] = ​Math.random() - генерация случайного числа, или каждый элемент массива вводится пользователем вручную​). Попробовать оба варианта. Для Math.random() можно также использовать округления сгенерированного числа до целого. ​В двух любых задачах на выбор использовать цикл while()
После заполнения массива данными, решить для него следующие задачи:
1. пройти по массиву, вывести все элементы в прямом и в обратном порядке.
2. найти произведения всех элементов массива, вывести
3. каждый 3-й элемент умножить на 2 (2-мя способами)
4. найти количество нулевых элементов, вывести количество. если нулевых элементов нет - вывести сообщение, что их нет
5. найти и вывести номер нулевых элементов. если нулевых элементов нет - вывести сообщение, что их нет
6. пройти по массиву и поменять местами каждые 2 соседних элемента
7. пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
8. найти минимальный-максимальный элементы и вывести
9. найти номер минимального-максимального элементов и вывести
10. проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)
11. заменить все элементы массива на полусумму соседних элементов
12. циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м, 2-й стент 4-м и т.д.)
 */

import java.util.Scanner;

public class core {

    static public void main (String[] args)
    {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");

        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size

        for (int i = 0; i < array.length; i++) //заполняем массив рандомными числами
        {
            int a = 0;
            int b = 11;
            int random_number = a + (int) (Math.random() * (b - a));
            array[i] = random_number;
        }
        for (int i = 0; i < array.length; i++) //Вывод массива
        {
            System.out.print (array[i] + " ");
        }
        System.out.print ("-Рандомный массив ");
        System.out.println (" ");

        //1. пройти по массиву, вывести все элементы в прямом и в обратном порядке.

        for (int i = 0; i < array.length; i++) //Вывод массива в прямом порядке
        {
            System.out.print (array[i] + " ");
        }
        System.out.print ("-Отсортирован в прямом порядке. ");

        for (int i = array.length-1; i >= 0; i--) //Вывод массива в обратном порядке
        {
            System.out.print (array[i] + " ");
        }
        System.out.print ("-Отсортирован в обратном порядке. ");
        System.out.println (" ");

        //2. найти произведения всех элементов массива, вывести

            long x = array[0];
            for (int i = 0; i < array.length; i++) {
            x = x * array[i];
        }
        System.out.print (x + " -Произведение массива. ");
        System.out.println (" ");

        //3. каждый 3-й элемент умножить на 2 (2-мя способами)

        for (int i = 0; i < array.length-2; i++)
        {
                i = i+2;
                int buf = array[i] * 2;
                System.out.print(buf + " ");
        }
        System.out.print ("-Каждый 3-й элемент умножен на 2");
        System.out.println (" ");

        //4. найти количество нулевых элементов, вывести количество. если нулевых элементов нет - вывести сообщение, что их нет

        int bufzero = 0;
        for (int i = 0; i < array.length; i++)
        {

            if (array[i] == 0) {
                bufzero = +1;
            } else {
            }
        }
        System.out.println("Колличество 0й в массиве = " + bufzero);
        System.out.println (" ");

        //5. найти и вывести номер нулевых элементов. если нулевых элементов нет - вывести сообщение, что их не

        int buf=0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0) {
                buf = i;
                System.out.print (" "+  buf);
            }
        }

        if (buf == 0) {
            System.out.println ("Нет элементов содержащих нули");
        }
        if (buf != 0) {
            System.out.println (" -Номера нулевых элементов массива");
        }
        System.out.println(" ");

        // 6. пройти по массиву и поменять местами каждые 2 соседних элемента

        int buf1 = 0;
        int buf2  = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < array.length; i++)
        {
            i++;
            buf1 = array[a];
            buf2 = array[b];
            array[b] = buf1;
            array[a] = buf2;
            a +=2;
            b +=2;
            System.out.print("");
        }

        for (int m = 0; m < array.length; m++) //Вывод массива
        {
            System.out.print(array[m] + " ");
        }
        System.out.print(" -Поменять местами каждые 2 соседних элемента в массиве");
        System.out.println();

        //7. пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.

        int buf3 = 0;
        int buf4  = 0;
        int a1 = 0;
        int b1 = array.length-1;
        for (int i = 0; i < array.length; i++)
        {
            i++;
            buf3 = array[a1];
            buf4 = array[b1];
            array[b1] = buf3;
            array[a1] = buf4;
            a1++;
            b1--;
            System.out.print("");
        }

        for (int m = 0; m < array.length; m++) //Вывод массива
        {
            System.out.print(array[m] + " ");
        }
        System.out.print(" -поменять местами первый и последний, второй и предпоследний и т.д.");
        System.out.println();

        //8. найти минимальный-максимальный элементы и вывести

        int bufmax = array[0];
        int bufmin = array[0];
        int nummax = 0;
        int nummin = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (bufmax < array[i])
            {
                bufmax = array[i];
                nummax++;
            }

            if (bufmin > array[i])
            {
                bufmin = array[i];
                nummin++;
            }

        }
        System.out.print(bufmin + " -Минимальное число массива ");
        System.out.print(bufmax + " -Максимальное число массива");

        System.out.println();

        //9. найти номер минимального-максимального элементов и вывести

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == bufmax)
            {
                nummax = i;
            }

            if (array [i] == bufmin)
            {
                nummin = i;
            }
        }
        System.out.println(nummax + " -Номер максимального элемента массива ");
        System.out.print(nummin + " -Номер минимального элемента массива");
        System.out.println();

        //10. проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)

        int counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array [i]<array[i++])
            {
                counter++;
            }
        }
        if (counter == array.length)
        {
            System.out.println(" -Mассив является возрастающей последовательностью");
        } else {
            System.out.println(" -Mассив НЕ является ли возрастающей последовательностью");
        }

        //11. заменить все элементы массива на полусумму соседних элементов
        int buf6 = 0;
        int buf7  = 0;

        for (int i = 0; i < array.length-2; i++)
        {
            int j = 0;
            int a2 = array[i];
            i++;
            i++;
            int b2 = array[i];
            j = (a2)/2 +(b2)/2;
            i--;
            array[i] = j;
            i--;
        }

        for (int m = 0; m < array.length; m++) //Вывод массива
        {
            System.out.print(array[m] + " ");
        }
        System.out.print(" -Полусуммы");
        System.out.println();
    }


}
