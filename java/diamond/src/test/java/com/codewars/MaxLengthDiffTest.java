package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxLengthDiffTest {

  @Test
  public void test() {
    System.out.println("mxdiflg Fixed Tests");
    String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa",
        "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
    String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
    assertEquals(13, MaxLengthDiff.mxdiflg(s1, s2)); // 13
  }

  @Test
  public void test1() {
    String[] s1 = new String[]{};
    String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
    assertEquals(-1, MaxLengthDiff.mxdiflg(s1, s2)); // 13
  }

  @Test
  public void test2() {
    String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa",
        "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
    String[] s2 = new String[]{};
    assertEquals(-1, MaxLengthDiff.mxdiflg(s1, s2)); // 13
  }

  @Test
  public void test3() {
    String[] s1 = new String[]{"ooono",
        "ddnneewhqqq",
        "rrmmppffttbbnnoqr",
        "t",
        "uuuff",
        "pbbffffaaa",
        "eeccccaawllldddffffn",
        "xxxnggguuuu",
        "agggguuppcccg"};
    String[] s2 = new String[]{"wwwwuuuuuucss",
        "ppeapppaa",
        "rrqsss"};
    assertEquals(14, MaxLengthDiff.mxdiflg(s1, s2)); // 13
  }
}
