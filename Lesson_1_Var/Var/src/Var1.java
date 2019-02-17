public class Var1 {
    public static void main (String[] args)
    {
        int i = 123456789;
        short sh = 12;
        long l = 14L;
        double d = 12.13;
        float f = 100.3333F;
        char c = 'x';
        boolean b = true;

        int result1 = i + sh;
        double result2 = l - d;
        double result3 = f * d;
        boolean result4 = l > d;
        boolean result5 = f < i;

        System.out.print("Result1:" + result1 + "; Result2:" + result2 + "; Result3:" + result3 + "; Result4:" + result4 + "; Result5:" + result5); //Не разрывает строку
        System.out.println();
        System.out.println("Result1:" + result1); //Переносит строку
        System.out.println("Result2:" + result2);
        System.out.println("Result3:" + result3);
        System.out.println("Result4:" + result4);
        System.out.println("Result5:" + result5);
    }
}
