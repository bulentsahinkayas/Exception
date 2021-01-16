package HomeworkClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataClass2_2 {
    public static void main(String[] args) {
        int number= 4;
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusDays(4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateOfToday = formatter.format(localDate);


//        String toString = dateToday.toString();
        System.out.println(dateOfToday);
    }
}
/*
Date date = Calendar.getInstance().getTime();
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                String strDate = dateFormat.format(date);
                System.out.println("Converted String: " + strDate);


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        String electionDate = "11 03 2020";
        LocalDate election = LocalDate.parse(electionDate, formatter);
        String toString = election.toString();
        System.out.println(toString);

        1- Create a method name as future
       Parameter is: int(howManyDays)
       Return type is String

2- Return the howManyDays ahead is the future date from today.

For Example:
   howManyDays equal to 4

   Today is 5/10/2020

    return should be 5/14/2020

For Example:
   howManyDays equal to 6

   Today is 5/10/2020

    return should be 5/16/2020
 */