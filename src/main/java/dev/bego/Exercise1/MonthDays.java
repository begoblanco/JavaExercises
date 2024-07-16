package dev.bego.Exercise1;

public class MonthDays {

    private String[] monthList = { "January", "February", "March",
            "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    private int[] daysList = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public String monthName(int month) {
        if (month < 1 || month > 12) {
            return "not a valid month number";
        } else {
            return monthList[month - 1];
        }
    }

    public int numberOfDays(int month) {
        if (month < 1 || month > 12) {
            return 0;
        } else {
            return daysList[month - 1];
        }
    }

}