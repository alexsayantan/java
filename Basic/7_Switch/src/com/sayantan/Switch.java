package com.sayantan;
public class Switch {
    int switchValues = 5;

    public static int switchCase(int switchValue) {
        switch(switchValue) {

            case 5:
                System.out.println(" Was a Five");
                break;
            case 6:
                System.out.println("Was a Six");
                break;
            default:
                System.out.println("Was not 1, 2,3,4 or 5");
                break;
        }
        return switchValue;
    }
}