package com.sayantan;

public class Main {

    public static void main(String[] args) {
    int a = getEvenDigitSum(12);
        System.out.println("Sum of Even Numbers = " + a);
    }
    public static int getEvenDigitSum(int number){
        int i=1,sum=0;
        if(number <= 0){
            return -1;
        }
        else {
            while (i <= number) {
                if (i % 2 == 0) {
                    sum += i;
                }
                i++;
            }
            return sum;
        }
    }
}
