package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExpandedTest {

  // TODO: Replace examples and use TDD development by writing your own tests
  @Test
  public void testSomething() {
    assertEquals("10 + 2", Expanded.expandedForm(12));
    assertEquals("40 + 2", Expanded.expandedForm(42));
    assertEquals("70000 + 300 + 4", Expanded.expandedForm(70304));
  }
}

