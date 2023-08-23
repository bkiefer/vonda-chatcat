package de.dfki.chatcat.util;

import java.util.Calendar;

public class Date {
  public static String timeOfDay() {
    java.util.Calendar c = Calendar.getInstance();
    int h = c.get(Calendar.HOUR_OF_DAY);
    if (h < 11) return "morning";
    else if (h < 13) return "midday";
    else if (h < 19) return "afternoon";
    return "evening";
  }
}
