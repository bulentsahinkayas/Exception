package HomeworkClasses;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateClass2 {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 6;
//        System.out.println(future(number1));
//        System.out.println(future(number2));
        Date date = new Date();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String strDate1 = "05/10/2020";

        LocalDate todaysDate = LocalDate.parse(strDate1,formatter1);
        todaysDate = todaysDate.minusDays(4);
        System.out.println(todaysDate);

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        String strDate2 = todaysDate.toString();
        System.out.println(strDate);
        strDate2 = formatter.format(todaysDate);
        System.out.println(strDate2);

    }
    /*
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        String electionDate = "11 03 2020";
        LocalDate election = LocalDate.parse(electionDate, formatter);
        String toString = election.toString();
        System.out.println(toString);
     */
    public static String future(int howManyDays){

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String strDate = "05/10/2020";

        LocalDate todaysDate = LocalDate.parse(strDate,formatter1);
        todaysDate = todaysDate.minusDays(howManyDays);
        SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyyy");
        String dateOfToday = formatter2.format(todaysDate);



        return  dateOfToday;
    }
    /*
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    String strDate = formatter.format(date);
    System.out.println("Date Format with MM/dd/yyyy : "+strDate);
     */
    public  static String checkDates(){

        LocalDate now = LocalDate.now();
        String MM = Integer.toString(now.getMonthValue());
        String dd = Integer.toString(now.getDayOfMonth());
        String yyyy = Integer.toString(now.getYear());

        String dateOfToday = MM+"/"+dd+"/"+yyyy;

        return dateOfToday;
    }
}
