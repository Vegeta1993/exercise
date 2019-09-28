package com.codewars;

import java.text.DecimalFormat;

public class Polygon {

  private static DecimalFormat df2 = new DecimalFormat("##.###");

  public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
    double sinof = 360.000 / numberOfSides;
    double sinpart = Math.sin(Math.toRadians(sinof));
    double otherpart = numberOfSides * Math.pow(circleRadius, 2) * 1 / 2;
    return Double.parseDouble(df2.format(otherpart * sinpart));
  }
}
