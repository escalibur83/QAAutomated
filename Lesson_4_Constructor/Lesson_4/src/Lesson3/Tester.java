package Lesson3;

public class Tester {

    public int id;
    public String name;
    public int age;
    public double salary;
    public double cleanSelary;

    public void setId (int id)
    {
        this.id = id;
    }

    public void setName (String name1)
    {
        this.name = name1;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public void setSalary (int salary)
    {
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName ()
    {
        return this.name;
    }

    public int getAge ()
    {
        return this.age;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public double getCleanSelary()
    {
        return this.salary * 0.8;
    }

    public void printAllInfo()
    {
        System.out.println (id+ " " + name + " " + age+ " " + salary + " " + getCleanSelary());
    }
}
