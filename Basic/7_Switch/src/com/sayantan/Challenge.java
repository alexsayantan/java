package com.sayantan;

public class Challenge {
    public static void main(String[] args) {

        dayOfTheWeek(1);
    }
    public static void dayOfTheWeek(int day) {
                switch(day){
                    case 0:
                        System.out.println("Sunday");
                        break;
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid Day");
                }
    }
    public static String dayOfTheWeek(byte day){
        if (day == 0)
            return "Sunday";
        else if (day == 1)
            return "Monday";
        else if (day == 2)
            return "Thuesday";
        else if (day == 3)
            return "Wednesday";
        else if (day == 4)
            return "Thursday";
        else if (day == 5)
            return "Friday";
        else if (day == 6)
            System.out.println("Saturday");
        else
            return "Invalid Day";
        return "Nice";
    }
}

