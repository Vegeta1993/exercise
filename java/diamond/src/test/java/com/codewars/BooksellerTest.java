package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BooksellerTest {

  @Test
  public void test1() {
    String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
    String[] cd = new String[]{"A", "B"};
    assertEquals("(A : 200) - (B : 1140)",
        Bookseller.stockSummary(art, cd));
  }

  @Test
  public void test2() {
    String[] art = new String[]{"CBART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
    String[] cd = new String[]{"A", "B", "C", "W"};
    assertEquals("(A : 0) - (B : 114) - (C : 70) - (W : 0)",
        Bookseller.stockSummary(art, cd));
  }

  @Test
  public void test3() {
    String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
    String[] cd = new String[]{};
    assertEquals("",
        Bookseller.stockSummary(art, cd));
  }

  @Test
  public void test4() {
    String[] art = new String[]{""};
    String[] cd = new String[]{"A", "B"};
    assertEquals("(A : 0) - (B : 0)",
        Bookseller.stockSummary(art, cd));
  }
}
