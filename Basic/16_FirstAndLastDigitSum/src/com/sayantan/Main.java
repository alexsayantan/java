package com.sayantan;

public class Main {

    public static void main(String[] args)
    {
        int number = 12356997;
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);

        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
        System.out.println("Sum of Last and First Digit = " + (firstDigit+lastDigit));
    }
}
