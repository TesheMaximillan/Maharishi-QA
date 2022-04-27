package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StantonMeasureTest {
  @Test
  public void testStantonMeasure() {
      StantonMeasure stantonMeasure = new StantonMeasure();
      assertEquals(stantonMeasure.stantonMeasure(new int[]{1}), 1);
      assertEquals(stantonMeasure.stantonMeasure(new int[]{0}), 1);
      assertEquals(stantonMeasure.stantonMeasure(new int[]{3, 1, 1, 4}), 0);
      assertEquals(stantonMeasure.stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}), 6);
      assertEquals(stantonMeasure.stantonMeasure(new int[]{}), 0);
  }
}
