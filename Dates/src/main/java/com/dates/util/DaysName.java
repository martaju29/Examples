package com.dates.util;

import java.text.DateFormatSymbols;

public class DaysName {
	 public static void main(String[] args) {
	      String[] weekdays = new DateFormatSymbols().getWeekdays();
	      for (int i = 2; i < (weekdays.length-1); i++) {
	         String weekday = weekdays[i];
	         System.out.println(weekday);
	      }
	     System.out.println(weekdays[1]);
	   }
}
