package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime {
  
  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());

    LocalDate localDate = LocalDate.of(2023, Month.SEPTEMBER, 7);
    LocalTime localTime = LocalTime.of(10, 30);

    System.out.println(localDate);
    System.out.println(localTime);
    System.out.println(LocalDateTime.of(localDate, localTime));

    // java 7
    System.out.println(new Date());

    Calendar calendar = Calendar.getInstance();
    calendar.set(2015, Calendar.JANUARY, 1);
    Date january = calendar.getTime();
    System.out.println(january);
  }
}
