package com.codewars;

/**
 * com.codewars.Diamond class returns diamond shape in strings
 */

class Diamond {

  static String print(int n) {
    String diamond = "";

    // n is even or negative
    if (n % 2 == 0 || n < 0) {
      return null;
    }

    // when n is odd
    int space = n / 2;
    int odd = 1;

    // first half
    for (int i = 0; i < n / 2; i++) {
      for (int j = 0; j < space; j++) {
        diamond += " ";
      }
      space -= 1;
      for (int j = 0; j < odd; j++) {
        diamond += "*";
      }
      diamond += "\n";
      odd += 2;
    }

    // middle
    for (int i = 0; i < n; i++) {
      diamond += "*";
    }
    diamond += "\n";

    // second half
    space += 1;
    for (int i = 0; i < n / 2; i++) {
      for (int j = 0; j < space; j++) {
        diamond += " ";
      }
      space += 1;

      odd -= 2;
      for (int j = 0; j < odd; j++) {
        diamond += "*";
      }
      diamond += "\n";
    }
    return diamond;
  }
}