package com.codewars;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Bookseller {

  public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
    Map<String, Integer> lstFromM;
    StringBuilder answer = new StringBuilder();

    if (lstOfArt.length == 0 | lstOf1stLetter.length == 0) {
      return "";
    }

    // Create a map of category with number of books
    lstFromM = Arrays.stream(lstOfArt)
        .filter((L) -> Arrays.stream(lstOf1stLetter).anyMatch(L::startsWith))
        .map(str -> str.split(" "))
        .collect(Collectors.toMap(str -> str[0].substring(0, 1),
            (str -> (str.length > 1) ? Integer.parseInt(str[1]) : 0),
            (oldvalue, newvalue) -> oldvalue + newvalue));

    // Stringify the map key-value pairs to proper format
    for (String key : lstOf1stLetter) {
      answer.append("(")
          .append(key)
          .append(" : ");

      if (lstFromM.get(key) == null) {
        answer.append(0);
      } else {
        answer.append(lstFromM.get(key).toString());
      }

      answer.append(")")
          .append(" - ");

    }

    if (answer.length() > 0) {
      return answer.delete(answer.length() - 3, answer.length()).toString();
    }
    return "";
  }

}