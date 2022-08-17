package com.company.InstanceMethods;

public class Task1 {
/*You are given a class Clock. It has two int fields: hours and minutes.
The clock has a minute scale from 0 to 59 and an hour scale from 1 to 12.
The clock does not know whether it's day or night (no AM or PM).
Implement the method next that increases the value of minutes by 1.
The minutes must be reset to zero when the current hour ends.
Do not forget to change the hours as well.*/
    int hours = 12;
    int minutes = 0;
    int temp = 00;
    int tem = 01;
    int twelve = 12;
    int fiftyNight = 59;
    int ten =10;

    void next() {
        if (hours <= twelve && minutes <= fiftyNight) {
            minutes++;
            if (minutes > fiftyNight) {
                hours++;
                minutes = temp;
                if (hours > twelve) {
                    hours = tem;
                }
            }
        }
    }
}
