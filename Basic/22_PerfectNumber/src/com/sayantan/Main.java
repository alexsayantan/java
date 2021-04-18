package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println("Perfect Number " + isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
    }
    public static boolean isPerfectNumber(int number){
        int i=1,perfectNumber=0;
        if (number<1){
            return false;
        }
        else {
            while (i<number){
                if (number%i==0){
                    perfectNumber += i;
                }
                i++;
            }
        }
        System.out.println(perfectNumber);
        return number == perfectNumber;
    }
}
