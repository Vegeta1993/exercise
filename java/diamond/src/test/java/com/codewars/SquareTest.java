package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

  @Test
  public void test1() {
    assertEquals(144, Square.findNextSquare(121));
  }

  @Test
  public void test2() {
    assertEquals(676, Square.findNextSquare(625));
  }

  @Test
  public void test3() {
    assertEquals(-1, Square.findNextSquare(114));
  }


}

