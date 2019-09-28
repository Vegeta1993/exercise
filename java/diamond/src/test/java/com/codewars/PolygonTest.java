package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolygonTest {

  @Test
  public void test1() {
    assertEquals(11.691, Polygon.areaOfPolygonInsideCircle(3, 3), 1e-4);
  }

  @Test
  public void test2() {
    assertEquals(8, Polygon.areaOfPolygonInsideCircle(2, 4), 1e-4);
  }

  @Test
  public void test3() {
    assertEquals(14.86, Polygon.areaOfPolygonInsideCircle(2.5, 5), 1e-4);
  }

  @Test
  public void test4() {
    assertEquals(27.335, Polygon.areaOfPolygonInsideCircle(3, 14), 1e-4);
  }
}
