package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q1SampleTest {

  @Test
  public void testQ1Sample() {
      Q1Sample isCenterd = new Q1Sample();
      assertEquals(isCenterd.isCenteredArray(new int[]{1, 2, 3, 4, 5}), 0);
      assertEquals(isCenterd.isCenteredArray(new int[]{3, 2, 1, 4, 5}), 1);
      assertEquals(isCenterd.isCenteredArray(new int[]{3, 2, 1, 4, 1}), 0);
      assertEquals(isCenterd.isCenteredArray(new int[]{1, 2, 3, 4}), 0);
      assertEquals(isCenterd.isCenteredArray(new int[]{}), 0);
      assertEquals(isCenterd.isCenteredArray(new int[]{10}), 1);
  }
}
