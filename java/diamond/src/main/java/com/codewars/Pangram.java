package com.codewars;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

  public boolean check(String sentence) {
    sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
    Set<Character> ascii = new HashSet<Character>();

    for (int i = 0; i < sentence.length(); i++) {
      ascii.add(sentence.charAt(i));
    }

    return ascii.size() == 26;
  }
}
