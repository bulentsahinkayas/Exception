package HomeworkClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateClass {
    public static void main(String[] args) {
        System.out.println(checkDates());
    }
    public  static String checkDates(){

        LocalDate now = LocalDate.now();
        String MM = Integer.toString(now.getMonthValue());
        String dd = Integer.toString(now.getDayOfMonth());
        String yyyy = Integer.toString(now.getYear());

        String dateOfToday = MM+"/"+dd+"/"+yyyy;

        return dateOfToday;
    }
}
/*
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        String electionDate = "11 03 2020";
        LocalDate election = LocalDate.parse(electionDate, formatter);
        String toString = election.toString();
        System.out.println(toString);
1- Create a method without parameter and name of method is checkDates

2- Return type: String

3- Return today's date  (month / day / year )
 LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        String todayDate = "11 30 2020";
        LocalDate dateTime = LocalDate.parse(todayDate, formatter);
        String toString = todayDate.toString();
        System.out.println(toString);
 */