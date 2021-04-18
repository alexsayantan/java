package com.sayantan;

public class Main {

    public static void main(String[] args) {
        printFactors(12);
        printFactors(11);
        printFactors(-12);
    }
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Number");
        }
        else {
            System.out.println("Factorials of " + number + " are : ");
            for (int i=1;i<=number;i++){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
