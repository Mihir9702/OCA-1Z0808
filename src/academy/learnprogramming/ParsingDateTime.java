package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {
  
  public static void main(String[] args) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date = LocalDate.parse("01 02 2015", formatter);
    LocalTime time = LocalTime.parse("11:22");

    System.out.println(date); // 2015-01-02
    System.out.println(time); // 11:22

    String text = date.format(formatter);
    System.out.println(text); // 01 02 2015

    LocalDate parsedDate = LocalDate.parse(text, formatter);
    System.out.println(parsedDate); // 2015-01-02

    // exam tricks
    LocalDate ld = LocalDate.of(2010, 10, 10);
    String dateString = formatter.format(ld);
    System.out.println(dateString); // 10 10 2010

    LocalDate ld2 = LocalDate.parse(dateString, formatter);
    ld2.plusMonths(5).plusDays(2); // return result is ignored
    System.out.println(ld2); // 2010-10-10
  }
}
