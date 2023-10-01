package com.leetCode.solving;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * <a href="https://leetcode.com/problems/number-of-days-between-two-dates">
 *   1360. Number of Days Between Two Dates</a>
 */
public class Issue1360 {
  public static void main(String[] args) {
    String date1 = "2020-01-15";
    String date2 = "2019-12-31";
    System.out.println("Initial dates: \ndate1=" + date1
      +"\ndate2=" + date2
      +"\nDays between these dates=" + daysBetweenDates(date1, date2));
  }

  public static int daysBetweenDates(String date1, String date2) {
    LocalDate date11 = LocalDate.of(Integer.parseInt(date1.substring(0,4)),
      Integer.parseInt(date1.substring(5,7)),
      Integer.parseInt(date1.substring(8,10)));
    LocalDate date22 = LocalDate.of(Integer.parseInt(date2.substring(0,4)),
      Integer.parseInt(date2.substring(5,7)),
      Integer.parseInt(date2.substring(8,10)));
    return (int) Math.abs(date11.toEpochDay() - date22.toEpochDay());
  }

  /* this one slower a bit
  public static int daysBetweenDates(String date1, String date2) {
    return (int) Math.abs(LocalDate.parse(date1).toEpochDay() - LocalDate.parse(date2).toEpochDay());
  }*/
}
