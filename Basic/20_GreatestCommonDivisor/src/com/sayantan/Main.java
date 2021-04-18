package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println("GCD = " + getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor(int first,int second){
        int gcd=1;
        if(first<=0 || second<=0){
            return -1;
        }
        for(int i = 1; i <= first && i <= second; i++)
        {
            if(first%i==0 && second%i==0)
                gcd = i;
        }
        return gcd;
    }
}
