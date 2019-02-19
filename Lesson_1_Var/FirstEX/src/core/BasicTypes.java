package core;

public class BasicTypes {
    public static void main (String[] args) {
        byte a;
        int b;
        int c = 10, c1 = 0777, c2 = 0x32, c3 = 0b10;
        short ds = 12;
        long dL = 12222;
        double d = 999999.25;
        char e ='x';
        boolean f = true;

        a = 1;
        b = 2;

        int s = c1;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
        System.out.println (s);

        if (a>2)
            System.out.println (a);
        else
            System.out.println (b);

        int cnt = 1;
        while (cnt<=15) {
            System.out.println(cnt);
            cnt++;
        }

        int aq = 10;
        int bq = 15;
        int cq = 20;
        if (aq>bq) {
            System.out.println ("aq more then b");
        } else {
            System.out.println ("bq not more then b");
        }

        int r = 1;

        do {
            System.out.println (r);
            r++;
        } while (r<=15);

        for (int i = 1; i < 16; i++)
        {
            System.out.println (i);
        }
    }
}
