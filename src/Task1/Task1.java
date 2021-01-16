package Task1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate dob = null;
        do {
            System.out.println("Input your birth date:");
            String userInput = scanner.nextLine();
            dob = convertToDate(userInput);
        } while (dob == null);

        Integer age = getAge(dob);
        System.out.println("Your age is " + age);
    }


    static public LocalDate convertToDate(String userInput){
        LocalDate date = null;
        try {
            date = LocalDate.parse(userInput, DateTimeFormatter.ofPattern("MM dd uuuu"));
        } catch (Exception e) {
            System.out.println("User input incorrect");
        }
        return date;
    }

    static public Integer getAge(LocalDate DOB) {
        LocalDate now = LocalDate.now();
        Period between = Period.between(DOB, now);
        Integer age = between.getYears();
        return age;
    }
}
/*
Create a class Task1
create a method that gets user input and converts it to a date
create a method that ask user for his Birth Date and returns his age
 */