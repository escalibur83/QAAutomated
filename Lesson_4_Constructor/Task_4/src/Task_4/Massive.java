package Task_4;

public class Massive {
    
    int [] mass;

    public void setMass (int [] mass) {this.mass = mass;}
    public int [] getMass () {return this.mass;}

    public void printMassiveAsLine()
    {
        int i;
        for (i = 0; i < getMass().length; i++)
        {
            System.out.print (getMass()[i]);
        }
    }

    public void printReverseMassiveAsLine()
    {
        int i;
        for (i = getMass().length; i > 0; i--)
        {
            System.out.print (getMass()[i]);
        }
    }

}
