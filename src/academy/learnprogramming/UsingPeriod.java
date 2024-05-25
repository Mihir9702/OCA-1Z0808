package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class UsingPeriod {
  
  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2015, 1, 1);
    LocalDate end = LocalDate.of(2015, 12, 31);
    Period period = Period.ofWeeks(1); // every one week

    // start.toEpochDay(); // number of days since January 1 1970

    cleanAnimalCage(start, end); // once a month

    System.out.println(start.plus(period));
    System.out.println(LocalDateTime.now().plus(period));
    // System.out.println(LocalTime.now().plus(period)); // UnsupportedTemporalTypeException - LocalTime does not contain date

    // Period yearAndMonth = Period.ofYears(1).ofMonths(1); // only the last one is used
    Period yearAndMonth = Period.of(1, 1, 0);
    System.out.println(yearAndMonth); // ofMonths: P1M // of: P1Y1M

    cleanAnimalCage(start, end, period); // once a week
  }

  public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
    while(start.isBefore(end)) {
      System.out.println("Need to clean the cage on date= " + start);
      start = start.plus(period); // add one month
    }
  }

  public static void cleanAnimalCage(LocalDate start, LocalDate end) {
    while(start.isBefore(end)) {
      System.out.println("Need to clean the cage on date= " + start);
      start = start.plusMonths(1); // add one month
    }
  }
}
