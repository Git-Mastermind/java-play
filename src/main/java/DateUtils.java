package main.java;

import java.util.HashMap;
import java.util.Scanner;

public class DateUtils {
    public String dateToDay(String month, int date, int year) {
        HashMap<Integer, String> daysOfTheWeek = new HashMap<Integer, String>();
        HashMap<String, Integer> months = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        daysOfTheWeek.put(1, "Sunday");
        daysOfTheWeek.put(2, "Monday");
        daysOfTheWeek.put(3, "Tuesday");
        daysOfTheWeek.put(4,"Wednesday");
        daysOfTheWeek.put(5, "Thurday");
        daysOfTheWeek.put(6, "Friday");
        daysOfTheWeek.put(0, "Saturday");

        months.put("January", 13);
        months.put("Febuary", 14);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);
        

        int m = months.get(month);


        int f = date + ((26 * (m + 1)) / 10) + year + (year / 4) + 6 * (year / 100) + (year / 400);
        int w = f % 7;

        String day = daysOfTheWeek.get(w);
        scanner.close();
        return day;
        
    }
}