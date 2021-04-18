package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2010));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(2012));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                return year % 400 == 0;
            }
            // if the year is not century
            else
                return true;
        }
        else
            return false;
    }
}
