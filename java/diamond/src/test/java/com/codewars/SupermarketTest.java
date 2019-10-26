package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SupermarketTest {

  @Test
  public void testNormalCondition() {
    assertEquals(9, Supermarket.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
  }

  @Test
  public void testEmptyArray() {
    assertEquals(0, Supermarket.solveSuperMarketQueue(new int[]{}, 1));
  }

  @Test
  public void testSingleTillManyCustomers() {
    assertEquals(15, Supermarket.solveSuperMarketQueue(new int[]{1, 2, 3, 4, 5}, 1));
  }

  @Test
  public void testCodewarsFail1() {
    assertEquals(17,
        Supermarket.solveSuperMarketQueue(new int[]{2, 3, 5, 5, 5, 2, 2, 7, 2, 6, 7}, 3));
  }

  @Test
  public void testCodewarsFail2() {
    assertEquals(113, Supermarket.solveSuperMarketQueue(
        new int[]{29, 18, 6, 23, 25, 29, 24, 17, 10, 8, 8, 22, 20, 16, 13, 17, 7, 21, 7, 11, 18, 26,
            25, 1, 18, 29, 16, 26, 7, 11, 13, 20, 12, 6, 23, 3, 10, 9, 8, 5, 6, 18, 19, 26, 5, 15,
            4, 15, 1, 4}, 7));
  }
}