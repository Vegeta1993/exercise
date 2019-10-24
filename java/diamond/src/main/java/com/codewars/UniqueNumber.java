package com.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumber {

  public static double findUniq(double[] arr) {

    List<Double> unique = Arrays.stream(arr).boxed().collect(Collectors.toList());

    unique.removeIf(n -> n.equals(arr[0]));
    if (unique.size() == 1) {
      return unique.get(0);
    } else {
      return arr[0];
    }
  }
}
