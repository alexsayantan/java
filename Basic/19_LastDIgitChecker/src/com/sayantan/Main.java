package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(128,240,173));
    }
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        int rem1,rem2,rem3;
        if((num1<=10 && num1>=1000) && (num2<=10 && num2>=1000) && (num3<=10 && num3>=1000)){
            return false;
        }
        else {
                rem1 = num1%10;
                rem2 = num2%10;
                rem3 = num3%10;
                if((rem1 == rem2) || (rem1 == rem3)){
                    return true;
            }
                else if ((rem2 == rem3) || (rem2 == rem1)){
                    return true;
                }
                else if((rem3 == rem1) || (rem3 == rem2)){
                    return true;
                }
        }
        return false;
    }
}
