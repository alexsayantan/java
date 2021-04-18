package com.sayantan;

public class SpeedCOnverter {

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0){
            return -1;
        }
        else {
            return Math.round(kilometerPerHour / 1.621d);
        }
    }
}
