package academy.learnprogramming;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateTime {
  
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2020, 1, 20);
    LocalTime time = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime = LocalDateTime.of(date, time);

    System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2020-01-20
    System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2020-01-20T11:12:34
    System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 11:12:34

    DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

    System.out.println(shortFormatter.format(dateTime)); // 1/20/20
    System.out.println(mediumFormatter.format(date)); // Jan 20, 2020
    // System.out.println(shortFormatter.format(time)); // UnsupportedTemporalTypeException - LocalTime does not contain date


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
    System.out.println(dateTime.format(formatter)); // January 20, 2020, 11:12
    // MMMM - January // MMM - Jan // MM - 01 // M - 1

    // Java 7
    SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
    System.out.println(sf.format(new Date())); // 11:12
  }
}
