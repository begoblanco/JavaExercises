package dev.bego.days_of_the_month;

public class Month {

    private String[] monthList = { "January", "February", "March",
            "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    public String monthName(int month) {
        if (month < 1 || month > 12) {
            return "not a valid month number";
        } else {
            return monthList[month - 1];
        }
    }
}