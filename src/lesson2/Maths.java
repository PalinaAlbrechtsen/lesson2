package lesson2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Maths {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = in.nextInt();

        System.out.println("Enter b: ");
        int b = in.nextInt();

        System.out.println("Enter c: ");
        int c = in.nextInt();

        int D = discriminant(a,b,c);
        boolean isPositive = isPositive(D);
        boolean isZero = isZero(D);

        if (isPositive) { // расчёт квадратных корней и вывод их на экран
            double x1 = (-b + sqrt(D))/(2*a);
            double x2 = (-b - sqrt(D))/(2*a);
            System.out.println("X1= " + x1);
            System.out.println("X2= " + x2);
        } else {
            if (isZero){
                int x = (-b)/(2*a);
                System.out.println("X= " + x);
            }
            else {
                System.out.println("Discriminant is negative: " + D);
            }

        }

    }

    private static int discriminant(int a, int b, int c){ // расчёт дискриминанта
        int D = (int) pow(b,2) - 4*a*c;
        return D;
    }

    private static boolean isZero(int D){ //добавляем признак нулевого дискриминанта
       boolean isZero = false;
        if (D==0)
            isZero = true;
        return isZero;
    }

    private static boolean isPositive(int D){ //добавляем признак положительного дискриминанта
        boolean isPositive = false;
        if (D > 0)
            isPositive = true;
        return isPositive;
    }

}
