package Task_4;

public class Person {

    String name;
    String surname;
    int age;
    int phone;

    public void setName (String name) {this.name = name;}
    public String getName () {return this.name;}

    public void setSurname (String surname) {this.surname = surname;}
    public String getSurname () {return this.surname;}

    public void setAge (int age) {this.age = age;}
    public int getAge () {return this.age;}

    public void setPhone (int phone) {this.phone = phone;}
    public int getPhone (){return this.phone;}

    public void printAllInformation ()
    {
        System.out.println ("Name: " + getName() + " Surname: " + getSurname() + " Age: " + getAge() + " Phone: " + getPhone());
    }

    public void printName ()
    {
        System.out.println ("Name: " + name + " Surname: " + surname);
    }

    public boolean isAdult()
    {
        return age>18;
    }
}
