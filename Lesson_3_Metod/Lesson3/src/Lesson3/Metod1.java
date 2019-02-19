package Lesson3;

import static Lesson3.Metod.sum;

public class Metod1 {

        public static void main (String[] args)
        {
            sum(5,7);
            sum(6, 8);

            int c = multiply(3,2,1);
            System.out.println (c);

            int[] mas = {1, 2, 3, -8};
            printReversMassive(mas);

            int[] mas1 = {1, 10, 3, -5};
            printReversMassive(mas1);

            multiplyBy2(mas);

            getMasSun(mas);
            System.out.println (getMasSun(mas));

            int [] mas2 = getZeroSun(mas);
            //getZeroSun(mas);
            for (int i = 0; i < mas2.length; i++)
            {
                System.out.println (mas2[i]);
            }

        }

        public static void printReversMassive (int[] anyMas)
        {
            for (int i = anyMas.length-1; i>=0; i--)
            {
                System.out.println (anyMas[i]);
            }
        }

        public static int multiply (int a,int b, int c)
        {
            return a * b * c;
        }

        public static void multiplyBy2 (int[] anyMas)
        {
            for (int i = 0; i<anyMas.length; i++)
            {
                System.out.println (anyMas[i]*2);
            }
        }

        public static int getMasSun (int [] anyMas)
        {
        int sum = 0;
        for (int i = 0; i< anyMas.length; i++)
        {
            sum = sum + anyMas[i];
        }
        return sum;
        }

        public static int[] getZeroSun (int [] anyMas)
        {
            int [] result = new int [anyMas.length];
            for (int i = 0; i < anyMas.length; i++)
            {
                if (i%2 == 0)
                {
                    result [i] = 0;
                } else {
                result [i] = anyMas [i];
                }
                }
                return result;
            }
        }

