package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordTest {

  @Test
  public void sampleTests() {
    assertEquals("taxi", Word.high("man i need a taxi up to ubud"));
    assertEquals("volcano", Word.high("what time are we climbing up to the volcano"));
    assertEquals("semynak", Word.high("take me to semynak"));
  }
}
