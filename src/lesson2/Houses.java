package lesson2;

import java.util.Scanner;

public class Houses {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("First house");
        System.out.println("Enter a: ");
        int a = in.nextInt();

        System.out.println("Enter b: ");
        int b = in.nextInt();


        System.out.println("Second house");
        System.out.println("Enter c: ");
        int c = in.nextInt();

        System.out.println("Enter d:");
        int d = in.nextInt();


        int e = 40;
        int f = 70;

        boolean isLong1 = (a + c) > e;
        boolean isLong2 = (a + c) > f; //maybe перегруженный код, потому что не знаю, как это можно упростить :(
        boolean isLong3 = (b + d) > e;
        boolean isLong4 = (b + d) > f;
        boolean isTooLong = false;

        if (isLong1 == true) { //сравнение суммы длин и ширин домов с длиной и шириной участка
            if (isLong4 == true) {
                isTooLong = true;
            } else {
                isTooLong = false;
            }
        } else {
            if (isLong2 == true) {
                if (isLong3 == true) {
                    isTooLong = true;
                } else {
                    isTooLong = false;
                }

            }

        }

        int S1 = Square(a, b);
        int S2 = Square(c, d);
        int SLand = Square(e, f);
        int SCommon = S1 + S2;
        if ((SCommon > SLand) || (isTooLong == true)) {
            System.out.println("Choose another land for your houses ;)");
        } else {
            System.out.println("You can build houses here!");
        }

    }

    private static int Square(int x, int y) { //рассчитываем площади
        int square = x * y;
        return square;
    }


}
