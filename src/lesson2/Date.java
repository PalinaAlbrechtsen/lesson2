package lesson2;

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = in.nextInt();

        System.out.println("Enter month: ");
        int month = in.nextInt();
        while (month > 12) {
            System.out.println("Please, enter the correct ordinal number of month: ");
            month = in.nextInt();
        }


        System.out.println("Enter day: ");
        int day = in.nextInt();
        while (day > maxValue(month, year)) {
            System.out.println("Please, enter correct day: ");
            day = in.nextInt();
        }


        nextDate(year, month, day);
    }


    private static boolean isLeapYear(int year) { //определяем, високосный ли год, чтобы в случае февраля
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //отследить количество дней
            return true;
        else
            return false;
    }

    private static int maxValue(int month, int year) { //определяем максимальное число для  каждого месяца
        int maxValue = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxValue = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxValue = 30;
                break;
            case 2:
                if (isLeapYear(year) == true)
                    maxValue = 29;
                else
                    maxValue = 28;
                break;

        }
        return maxValue;
    }


    private static void nextDate(int year, int month, int day) { // определяем дату след.дня
        if (month == 12 && day == 31) {
            day = 01;
            month = 01;
            year++;
        } else {
            if (day == maxValue(month, year)) {
                day = 01;
                month++;
            } else {
                day++;
            }
        }

        System.out.println("Next date: " + day + "." + month + "." + year);

    }
}


