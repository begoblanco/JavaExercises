package dev.bego.days_of_the_month;

import java.util.Scanner;

public class AppDaysMonths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a valid month number: "); 
        int month = scanner.nextInt();

        Month monthDays = new Month(); 
        Day days = new Day();       
    
        String monthName = monthDays.monthName(month);
        int daysInMonth = days.numberOfDays(month);

        System.out.println("Month " +  monthName);
        System.out.println();      
        System.out.println("Days: " + daysInMonth);

        scanner.close();
    }
    
}
