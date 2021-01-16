import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TrialClass {
    public static void main(String[] args) {

        System.out.println(relativeAgeChecker("11 18 2002"));
    }
    public static boolean relativeAgeChecker(String  relativeDoB){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");

        LocalDate DOB = LocalDate.parse(relativeDoB, formatter);
        LocalDate now = LocalDate.now();

        Period between = Period.between(DOB, now);

        if (between.getYears() < 18){
            return false;
        }
        else {
            return true;
        }
    }
}
