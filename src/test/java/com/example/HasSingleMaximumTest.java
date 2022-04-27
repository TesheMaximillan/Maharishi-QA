package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HasSingleMaximumTest {
  @Test
  public void testHasSingleMaximum() {
      HasSingleMaximum hasSingleMaximum = new HasSingleMaximum();
      assertEquals(hasSingleMaximum.hasSingleMaximum(new int[]{1, 2, 3, 1, 0}), 1);
      assertEquals(hasSingleMaximum.hasSingleMaximum(new int[]{18}), 1);
      assertEquals(hasSingleMaximum.hasSingleMaximum(new int[]{1, 2, 3, 0, 1, 3}), 0);
      assertEquals(hasSingleMaximum.hasSingleMaximum(new int[]{13, 1, 13, 2, 13, 0, 13, 1, 13}), 0);
      assertEquals(hasSingleMaximum.hasSingleMaximum(new int[]{}), 0);
      assertEquals(hasSingleMaximum.hasSingleMaximum(new int[]{-6, -6, -6, -6, -6, -6, -6}), 0);
  }
}
