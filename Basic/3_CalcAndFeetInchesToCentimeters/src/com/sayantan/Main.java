package com.sayantan;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(7,5);
        System.out.println(calcFeetAndInchesToCentimeters(10,0));
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(157));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0 && inches > 12))) {
            System.out.println("Invalid");
            return -1;
        }
        else {
            double centimeterfeet = (feet * 12)*2.54;
            centimeterfeet += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeterfeet + "cm");
            return  centimeterfeet;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0)
        {
            System.out.println("Invalid");
            return -1;
        }
        double feet = (int) (inches/12);
        double remainingInches = (int) (inches % 12);
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
