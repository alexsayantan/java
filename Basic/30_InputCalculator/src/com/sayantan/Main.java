package com.sayantan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);

        double sum  = 0,avg = 0;

        while (true) {
            System.out.println("Enter Number = ");
            boolean number = scan.hasNextDouble();
            System.out.println(number);

            if (number) {
                System.out.println("Enter Number : ");
                double n = scan.nextDouble();
                System.out.println(n);
                sum += n;
                avg = sum/n;
            } else
                break;
            scan.nextLine();
        }
        System.out.println("Sum = " + sum);
        System.out.println("Round-off Sum = " + Math.round(sum));
        System.out.println("Average = " + avg);
        System.out.println("Round-off Average = " + Math.round(avg));

        scan.close();
    }
}
