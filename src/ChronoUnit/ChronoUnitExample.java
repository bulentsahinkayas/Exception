package ChronoUnit;

import task2.Task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ChronoUnitExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate afterOneDecade = now.plus(2, ChronoUnit.DECADES);

        System.out.println(afterOneDecade);

        long between = ChronoUnit.DAYS.between(now, afterOneDecade);
        System.out.println(between);
    }
}
