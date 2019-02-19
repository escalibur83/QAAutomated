package Lesson3;

import java.util.Scanner;

/*
Создать пустой массив типа int с названием mas размера n=5;
Создать пустой массив типа double с названием mas_double такого размера, который пользователь вводит с клавиатуры (лучше >10);
Заполнить mas числами от 1 до 5; Вывести его
Заполнить mas_double рандомными числами, используя Math.Random(); Вывести его
К каждому элементу mas прибавить 2. Вывести результат
Каждый элемент mas_double возвести в квадрат. Вывести результат
Вывести через один элементы массива mas
Вывести элементы массива mas_double, номер которых делится без остатка на 3.

 */
public class First {
    public static void main (String[] args)
    {
        int n = 5;
        int[] mas = new int[n];

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        System.out.println("Введите элементы массива: ");
        double [] mas_double = new double[size]; // Создаём массив double размером в size

        for (int i = 0; i < mas_double.length; i++)  //заполнили массив
        {
            mas_double[i] = input.nextDouble();
        }

        System.out.println ();
        System.out.println ("Рандомно полученный массив");
        for (int j = 0; j < size; j++)
        {
            System.out.print(" " + mas_double[j]); // Выводим на экран, полученный массив
        }

        int a = 1; //от
        int b = 5; //до не включительно

        for (int i = 0; i < mas.length; i++)
        {
            //double random_number1 = Math.random(); // Генерация 1-го числа
            int random_number = a + (int) (Math.random()*b); // Генерация в заданном диапазоне

            mas[i] = random_number;
            //System.out.println("Cлучайное число: " + random_number);
        }
        System.out.println ();
        System.out.println ("Рандомно заполненый mas");
        for (int i = 0; i < mas.length; i++)
        {
            System.out.print(" " + mas[i]); // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("Рандомно заполненый массив double");
        for (int i = 0; i < mas_double.length; i++)  //заполнили массив
        {
            mas_double[i] = Math.random();
        }

        for (int j = 0; j < size; j++)
        {
            System.out.print(" " + mas_double[j]); // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("К каждому элементу mas +2");

        for (int i = 0; i < mas.length; i++)
        {
            int cof = 2; // Коэффициент
            mas[i] += cof;
            //System.out.println("Cлучайное число: " + random_number);
        }

        for (int i = 0; i < mas.length; i++)
        {
            System.out.print(" " + mas[i]); // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("Каждый элемент массива double возведен в квадрат");
        for (int i = 0; i < mas_double.length; i++)  //заполнили массив
        {
            mas_double[i] *= mas_double[i];
        }
        for (int i = 0; i<mas_double.length; i++)
        {
            System.out.print(" " + mas_double[i]);
        }

        System.out.println ();
        System.out.println ("Элементы массива mas через один");

        for (int i = 0; i < mas.length; i+=2)
        {
            System.out.print(" " + mas[i]);
            // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("Порядковый номер массива mas_double, номер которых делится без остатка на 3.");

        for (int i = 0; i < mas_double.length; i++)
        {
            if (i % 3 == 0)
            {
                System.out.print(" " + mas_double[i]);
            }
        }
    }
}