package com.codewars;


import java.util.Arrays;

public class Order {

  public static String order(String words) {
    // return empty string when input is empty
    if (words.isEmpty()) {
      return "";
    }

    String[] ArrayOrder = words.split(" ");
    String[] order = new String[ArrayOrder.length];

    // sort based on the number in each word
    Arrays.stream(ArrayOrder).forEach(word -> {
      int number = Integer.parseInt(word.replaceAll("[^0-9]", ""));
      order[number - 1] = word;
    });

    return String.join(" ", order);
  }
}