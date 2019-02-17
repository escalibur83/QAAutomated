package Task_4;

public class Main {

    public static void main (String[] args)
    {
        Person person = new Person();
        Massive massive = new Massive();


        person.setName("Alexandr");
        person.setSurname("Velikiy");
        person.setAge(17);
        person.setPhone(888888888);

        massive.setMass (new int[]{5, 2, 3, 8, 7});

        person.printAllInformation();
        person.printName();
        person.isAdult();

        massive.printMassiveAsLine();
        massive.printReverseMassiveAsLine();
    }
}
