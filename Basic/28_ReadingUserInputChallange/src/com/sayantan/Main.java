package com.sayantan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner number = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = number.hasNextInt();
            if (isAnInt){
                int n = number.nextInt();
                counter++;
                sum +=  n;
                if (counter == 10){
                    break;
                }
            }else {
                System.out.println("Invalid");
            }
            number.nextLine();
        }
        System.out.println("Sum = " + sum);
        number.close();
    }
}
