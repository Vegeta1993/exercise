package com.codewars;

/**
 * Word returns the word with highest sum of alphabetical position
 */
public class Word {

  public static String high(String s) {

    String[] words = s.split(" ");

    int[] value = new int[words.length];

    // compute the sum based on ASCII position
    for (int index = 0; index < words.length; index++) {
      int sum = 0;
      for (int i = 0; i < words[index].length(); i++) {
        sum += (int) words[index].charAt(i) - 96;
      }
      value[index] = sum;
    }

    // search for the max
    int maxindex = 0;
    for (int i = 0; i < value.length - 1; i++) {
      if (value[i + 1] > value[maxindex]) {
        maxindex = i + 1;
      }
    }
    return words[maxindex];
  }
}
