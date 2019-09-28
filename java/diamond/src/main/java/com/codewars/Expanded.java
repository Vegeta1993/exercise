package com.codewars;

import java.util.ArrayList;
import java.util.List;

public class Expanded {

  public static String expandedForm(int num) {

    // Start dividing with 10
    int divisor = 10;

    List<Integer> expandedForm = new ArrayList<Integer>();
    String form = "";

    // Keep applying logic till number is not zero
    while (num > 0) {

      // Find the remainder, add it to list when it is not zero
      // Increase divisor by 10
      int remainder = num % divisor;
      divisor *= 10;
      if (remainder != 0) {
        num -= remainder;
        expandedForm.add(remainder);
      }
    }

    // Create the string form
    for (int i = expandedForm.size() - 1; i > 0; i--) {
      form += expandedForm.get(i);
      form += " + ";
    }
    form += expandedForm.get(0);
    return form;
  }
}
