import java.util.Scanner;

public class Task1 {

        public static void main(String [] args) {
            Scanner input = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Введите длину массива: ");

            int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
            int array[] = new int[size]; // Создаём массив int размером в size
            System.out.println("Введите " + size + " элемента массива:");

            /*Пройдёмся по всему массиву, заполняя его*/
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }

            System.out.print("Введенные элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + array[i]); // Выводим на экран, полученный массив
            }
            System.out.println();

            System.out.print("Введенные элементы массива в обратном порядке:");
            for (int i = size-1; i >= 0; i--) {
                System.out.print(" " + array[i]); // Выводим на экран, полученный массив
            }
            System.out.println();

            System.out.print("Произведение всех элементов массива:");
            int x = array[0];
            int y = 0;
            for (int i = 0; i < array.length; i++) {
                x = x * array[i];
            }
            System.out.print(" " + x); // Выводим на экран, полученное произведение
            System.out.println();
        }
}
