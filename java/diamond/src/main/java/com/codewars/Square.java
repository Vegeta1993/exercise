package com.codewars;

public class Square {

  public static long findNextSquare(long sq) {

    double Sqrt = Math.sqrt(sq);
    if (Math.floor(Sqrt) == Math.ceil(Sqrt)) {
      return (long) ++Sqrt * (long) Sqrt;
    } else {
      return -1;
    }
  }
}
