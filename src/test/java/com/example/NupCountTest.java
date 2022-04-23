package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NupCountTest {
  @Test
  public void testNupCount() {
      NupCount upcount = new NupCount();
      assertEquals(upcount.upCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5), 3);
      assertEquals(upcount.upCount(new int[]{6, 3, 1}, 6), 1);
      assertEquals(upcount.upCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 6), 1);
  }
}
