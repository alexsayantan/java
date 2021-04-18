package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,44));
        System.out.println(hasSharedDigit(23,34));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int rem, remainder;
        if ((number1 >= 0 && number1 <= 99) && (number2 >= 0 && number2 <= 99)) {
            while (number1 != 0) {
                rem = number1 % 10;
                while (number2 != 0) {
                    remainder = number2 % 10;
                    if (rem == remainder) {
                        return true;
                    }
                    number2 /= 10;
                }
                number1 /= 10;
            }
        }
        return false;
    }
}
