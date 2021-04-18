package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of Digits = " + sumDigit(125));
        System.out.println("Sum of Digits = " + sumDigit(234523));
        System.out.println("Sum of Digits = " + sumDigit(9));

    }
    public static int sumDigit(int number){
        if(number>= 10){
            int sum = 0;
            while (number>0){
                int digit = number%10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
