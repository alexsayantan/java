package com.sayantan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    MinMaxmethod1();
    MinMaxMethod2();

    }
    public static void MinMaxmethod1(){

        Scanner scanner = new Scanner(System.in);

        int min = 0,max = 0;
        boolean first = true;
        while (true){
            System.out.println("Enter Number : ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    max=number;
                    min=number;
                }
                if(number>max){
                    max = number;
                }
                if (number<min){
                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine(); // handle Input (enter key)
        }
        System.out.println("Minimum Value = " + min + " Maximum Value = " + max);
    }
    public static void MinMaxMethod2(){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter Number : ");
            boolean isAnInt = scan.hasNextInt();

            if(isAnInt==true){
                int n = scan.nextInt();
                if(n>max)
                    max = n;
                if (n<min)
                    min = n;
            }
            else
                break;
            scan.nextLine();
        }
        System.out.println("Max = " + max + " Min = " + min);
        scan.close();
    }
}
