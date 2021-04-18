package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(7.345, 7.345));
        System.out.println(areEqualByThreeDecimalPlaces(12.342,13.023));
        System.out.println("Sum of 12 + 13 = 25 is " + hasEqualSum(12,13,25) + ".");
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        if ((int) (number1 * 1000) == (int) (number2 * 1000)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean hasEqualSum(int a,int b,int c){
        if ( a + b == c){
            return true;
        }
        else {
            return false;
        }
    }
}
