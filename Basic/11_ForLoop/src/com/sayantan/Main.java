package com.sayantan;

public class Main {

    public static void main(String[] args) {
        for(int i=2; i<=8; i++ ){
            System.out.println("10000.0 at " + i + "% interest = "
                    + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        System.out.println("\n*********** Opposite Loop ***********");
        for (int i=8; i>=2; i--){
            System.out.println("10000.0 at " + i + "% interest = "
                    + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        boolean prime = isPrime(19);
        System.out.println("\n" + prime + "! The Number is Prime");
        boolean prime2 = isPrime(20);
        System.out.println(prime2 + "! The Number is Not Prime");
        isPrime(1);
        isPrime(-190);

        int count=0;
        for (int i=10;i<=140;i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " is a Prime NUmber");
                if(count == 10){
                    System.out.println("Exiting");
                    break;
                }
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
    public static boolean isPrime(int n){
        if (n==1 || n < 0)
            System.out.println(n + " is Neither Prime Nor Composite");
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
