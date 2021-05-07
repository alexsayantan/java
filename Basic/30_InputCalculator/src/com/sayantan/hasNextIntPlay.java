package com.sayantan;

import java.util.Scanner;

public class hasNextIntPlay {
    public static void main(String[] args){
        HasNextIntPlay();
    }
    public static void HasNextIntPlay(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter NUmber : ");
        while (true){
            boolean number = scanner.hasNextDouble();
            if (number){
                int num = scanner.nextInt();
                sum += num;
            }
            else break;
        }
        System.out.println(sum);
    }
}
