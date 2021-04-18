package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalingdrome(101));
        System.out.println(isPalingdrome(102));
    }
    public static boolean isPalingdrome(int number){
        int reverse;
        int sum = 0;
        int temp = number;
        while (number > 0){
            reverse = number%10;
            sum = (sum * 10)+reverse;
            number /= 10;
        }
        return (sum == temp);
    }
}
