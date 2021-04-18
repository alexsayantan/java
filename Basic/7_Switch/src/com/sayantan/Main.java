package com.sayantan;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 5;
	    switchCase(switchValue);
	    int s = switchCase(4);
        System.out.println("Returning Switch Value = " + s );
        int a = Switch.switchCase(5);
        System.out.println("Returning = " + a);
        int c = Switch.switchCase(6);
        System.out.println("Returning = " + c);
        char ab = 'A';
        switchCase(ab);

        switchCase("JanUary");
        String month = "FebruAry";
        System.out.println(month.toLowerCase());
        System.out.println(month.toUpperCase());

        Challenge.dayOfTheWeek(0);//USING SWITCH CASE
        Challenge.dayOfTheWeek(6);
        Challenge.dayOfTheWeek(3);

        System.out.println("Using If Else");
        Challenge.dayOfTheWeek(1);//USING IF-ELSE
        Challenge.dayOfTheWeek(4);
    }

    public static int switchCase(int switchValue) {
        switch (switchValue) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a Three, Was a Four, Was a Five");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2,3,4 or 5");
                break;
        }
        return switchValue;
    }
    public static void switchCase(char switchValue){
        switch (switchValue){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case  'C':
                System.out.println("C");
            case  'D':
                System.out.println("D");
            default:
                System.out.println("E");

        }
    }
    public static void switchCase(String swichValue){
        switch (swichValue.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
        }

    }

}
