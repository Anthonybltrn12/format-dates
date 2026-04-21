package com.pluralsight;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class formatDates {


    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(currentDate.format(formatter1));
        System.out.println(currentDate.getDayOfWeek() + " " + currentDate.getDayOfMonth() + ", " + currentDate.getYear());
        System.out.println(currentDate.getDayOfWeek() + " " + currentDate.getDayOfMonth() + ", " + currentDate.getYear() + "  " + currentTime.getHour() + ":" + currentTime.getMinute());



    }
}
