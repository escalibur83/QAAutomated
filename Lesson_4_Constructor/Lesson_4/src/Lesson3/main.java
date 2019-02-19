package Lesson3;

public class main {

    public static void main (String[] args)
    {
        Tester tester1 = new Tester();
        tester1.setId(1);
        tester1.setAge(25);
        tester1.setName("Basia");
        tester1.setSalary(500);

        Tester tester2 = new Tester();
        tester2.setId(2);
        tester2.setAge(50);
        tester2.setName("Kate");
        tester2.setSalary(1000);

        System.out.println (tester1.getId() + " " + tester1.getAge()+ " " + tester1.getName() + " " + tester1.getSalary());
        System.out.println (tester2.getId() + " " + tester2.getAge()+ " " + tester2.getName() + " " + tester2.getSalary());
        System.out.println (tester1.getCleanSelary() + " CleanSel");
        System.out.println (tester2.getCleanSelary()+ " CleanSel");

        tester1.printAllInfo();
    }
}
