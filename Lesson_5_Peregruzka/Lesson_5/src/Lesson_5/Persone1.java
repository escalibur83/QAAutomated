package Lesson_5;

public class Persone1 {

    public int id;
    public String name;
    public int age;
//constructor

    public Persone1 (int id)
    {
        this.id = id;
    }

    public Persone1 (int id, String name)
    {

        this(id); // this.id = id
        this.name = name;
    }
    public Persone1 (int id, String name, int age)
    {
        this(id, name);
        this.age = age;
    }

    public void printAll ()
    {
        System.out.println (this.id + this.name + this.age);
    }
}
