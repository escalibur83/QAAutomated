package Task_1;

public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    double salary;

    //конструкторы
    public Tester (String name) {this.name = name;}
    public Tester (String name, String surname) {this(name); this.surname = surname;}
    public Tester (String name, String surname, int expirienceInYears) {this(name, surname); this.expirienceInYears = expirienceInYears;}
    public Tester (String name, int salary) {this(name); this.salary = salary;}

    //методы
    static String fullName (String name, String surname, String englishLevel)
    {
        return "Name: " + name + " Surname:  " + surname + " EnLevel:  " + englishLevel;
    }

    static int expirens (int expirienceInYears, int salary)
    {
        return expirienceInYears;
    }

    static double fullsalary (double salary)
    {
        return salary*0.8;
    }

    public static void prinrAllInformstio ()
    {
        System.out.println (" ");
    }

}
