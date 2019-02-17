package Lesson_5;

public class Square {

    public int getPerimetr (int a)
    {
        return a*4;
    }

    public int getSquare (int a)
    {
        return a * a;
    }

    public int getPerimetr (int r, double PI)
    {
        return (int) (PI * 2 * r);
    }

    public int getSquare (int r, double PI)
    {
        return (int) (PI * r * r);
    }

    public int getPerimetr (int a, int b, int c)
    {
        return a + b + c;
    }

    public int getSquare (int b, int h)
    {
        double u = 1/2;
        return (int) (u + b + h);//приведение типов
    }

}
