package com.codewars;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxLengthDiff {

  public static int mxdiflg(String[] a1, String[] a2) {
    OptionalInt max1 = Arrays.stream(a1)
        .mapToInt(String::length)
        .max();
    OptionalInt min1 = Arrays.stream(a1)
        .mapToInt(String::length)
        .min();
    OptionalInt max2 = Arrays.stream(a2)
        .mapToInt(String::length)
        .max();
    OptionalInt min2 = Arrays.stream(a2)
        .mapToInt(String::length)
        .min();

    if (!max1.isPresent() || !max2.isPresent()) {
      return -1;
    }
    return Math.max(max1.getAsInt() - min2.getAsInt(), max2.getAsInt() - min1.getAsInt());
  }
}
