package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {
  
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2010, 5, 15);
    System.out.println(date); // 2010-05-15

    date = date.plusDays(10).plusMonths(3); // immutable
    System.out.println(date); // 2010-08-25

    LocalTime time = LocalTime.of(10, 30);
    System.out.println(time); // 10:30

    time = time.plusHours(2).plusMinutes(20);
    System.out.println(time); // 12:50

    LocalDateTime localDateTime = LocalDateTime.of(date, time);
    System.out.println(localDateTime); // 2010-08-25T12:50

    localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
    System.out.println(localDateTime); // 2010-09-01T02:50

    // java 7
    Date myDate = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(myDate);
    calendar.set(Calendar.DATE, 1);
    calendar.set(Calendar.MONTH, 2);
    myDate = calendar.getTime();
    System.out.println(myDate); // Wed Mar 01 8:30:14 EST 2023 // (Current Time)

    // exam tricks
    LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
    ld.plusDays(10); // return result is ignored
    System.out.println(ld); // 2010-04-01

    // ld.plusMinutes(10); // LocalDate does not contain time
    
    LocalTime lt = LocalTime.of(12, 45);
    // lt.addDays(3); // LocalTime does not contain days
  }
}
