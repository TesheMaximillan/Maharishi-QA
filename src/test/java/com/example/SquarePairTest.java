package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquarePairTest {
  @Test
  public void testSquarePair() {
      SquarePair squarePair = new SquarePair();
      assertEquals(squarePair.squarePair(new int[]{9, 0, 2, -5, 7}), 2);
      assertEquals(squarePair.squarePair(new int[]{9}), 0);
  }
}
