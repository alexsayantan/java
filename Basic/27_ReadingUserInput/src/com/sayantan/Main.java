package com.sayantan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Enter Your Year of Birth : ");
        int yearOfBirth = scan.nextInt();
        scan.nextLine();
        System.out.println("\n Enter Current Year : ");
        int currentYear = scan.nextInt();
        scan.nextLine();
        System.out.println("\n Enter Your Name : ");
        String name = scan.nextLine();
        System.out.println("Your Name is " + name);
        int age = currentYear - yearOfBirth;
        System.out.println("Age = " + age);
        scan.close();
    }
}
