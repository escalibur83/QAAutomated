package Lesson3;

import java.util.Scanner;

/*
Создать пустой массив типа int с названием mas_1 размера n=7;
Создать пустой массив типа float с названием mas_float такого размера, который пользователь вводит с клавиатуры (лучше >10);
Заполнить mas1 числами от 1 до 7; Вывести его
Заполнить mas_float рандомными числами, используя Math.Random(); Вывести его
Каждый элемент mas_1 умножить на 3. Вывести результат
Каждый элемент mas_float возвести в квадрат. Вывести результат
Вывести элементы mas1 через один
*/
public class Second {
    public static void main (String[] args)
    {
        int n = 7;
        int[] mas_1 = new int[n];

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        System.out.println("Введите элементы массива: ");
        float [] mas_float = new float[size]; // Создаём массив float размером в size

        for (int i = 0; i < mas_float.length; i++)  //заполнили массив
        {
            mas_float[i] = input.nextFloat();
        }

        System.out.println ();
        System.out.println ("Float массив");
        for (int j = 0; j < size; j++)
        {
            System.out.print(" " + mas_float[j]); // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("Заполняем mas_1 рандомными числами");
        for (int i = 0; i < mas_1.length; i++)
        {
            int a = 1; //от
            int b = 8; //до не включительно
            int random_number = a + (int) (Math.random()*b); // Генерация в заданном диапазоне
            mas_1[i] = random_number;
        }
        for (int j = 0; j < mas_1.length; j++)
        {
            System.out.print(" " + mas_1[j]); // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("Заполняем mas_float рандомными числами");
        for (int i = 0; i < mas_float.length; i++)
        {
            int a = 0; //от
            int b = 10; //до не включительно
            int random_number = a + (int) (Math.random()*b); // Генерация в заданном диапазоне

            mas_float[i] = random_number;
        }
        for (int j = 0; j < size; j++)
        {
            System.out.print(" " + mas_float[j]); // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("Каждый элемент mas_1 умножаем на 3");
        for (int i = 0; i < mas_1.length; i++)
        {
            float cof = 3; // Коэффициент
            mas_1[i] *= cof;
            //System.out.println("Cлучайное число: " + random_number);
        }

        for (int i = 0; i < mas_1.length; i++)
        {
            System.out.print(" " + mas_1[i]); // Выводим на экран, полученный массив
        }

        System.out.println ();
        System.out.println ("Каждый элемент массива mas_float возведен в квадрат");
        for (int i = 0; i < mas_float.length; i++)  //заполнили массив
        {
            mas_float[i] *= mas_float[i];
        }
        for (int i = 0; i<mas_float.length; i++)
        {
            System.out.print(" " + mas_float[i]);
        }

        System.out.println ();
        System.out.println ("Элементы массива mas через один");

        for (int i = 0; i < mas_float.length; i++)
        {
            i++;
            System.out.print(" " + mas_float[i]);
        }

        System.out.println ();
        System.out.println ("Сортировка mas_float");
    }
}
