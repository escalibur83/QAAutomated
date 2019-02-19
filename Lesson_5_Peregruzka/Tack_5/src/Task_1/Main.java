package Task_1;
/*
Общее домашнее задание
Создать класс Tester со следующими полями:
-name
-surname
-expirienceInYears
-englishLevel
-salary
1. Перегрузить в этом классе 3 конструктора, каждый из которых будет последовательно вызывать другой используя this(...);
2. Написать 3 любых перегруженных метода в этом классе
3. Написать статический метод и показать пример его корректного вызова в другом классе
 */

public class Main {

    public static void main (String[] args)
    {
        System.out.println(Tester.fullName("Vasia", "Alexandrovich", "B2"));
        System.out.println(Tester.expirens(5,600));

        System.out.println (Tester.fullsalary(700));
    }

}
