package HomeworkClasses;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateClass4 {
    public static void main(String[] args) {

        System.out.println(checkAge("12/23/2000"));
    }
    public static int checkAge(String dateOfBirth){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate DOB = LocalDate.parse(dateOfBirth, formatter);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(DOB, now);
        int age = diff.getYears();
        return age;
    }
}
/*
1- Create a method name as checkAge
      Parameter is: string(dateOfBirth)
      Return type is int

2- Compare today date to dateOfBirth .  Print the age

for example:
    dateOfBirth equal to 02/20/2000

     return should be 20
 */