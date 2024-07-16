package dev.bego.Exercise1;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a valid month number: "); 
        int month = scanner.nextInt();

        MonthDays monthDays = new MonthDays();        
    
        String monthName = monthDays.monthName(month);
        int days = monthDays.numberOfDays(month);

        System.out.println("Month " +  monthName);
        System.out.println();      
        System.out.println("Days: " + days);

        scanner.close();
    }
    
}
