package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(13));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(15));
        System.out.println(isEvenNumber(7));
        System.out.println(isEvenNumber(38));

        int number = 1;
        int finish = 20;
        int count = 0;

        while (number <= finish) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            if (count >= 5) {
                break;
            }
            System.out.println("Even Number " + number);
        }
        System.out.println("Total Even Numbers Found = " + count);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
