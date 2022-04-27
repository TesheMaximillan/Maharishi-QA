package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q1SampleTest {

  @Test
  public void testQ1Sample() {
      IsOnionArray isOnionArray = new IsOnionArray();
      assertEquals(isOnionArray.isOnionArray(new int[] {1, 2, 19, 4, 5}), 1);
      assertEquals(isOnionArray.isOnionArray(new int[] {1, 2, 3, 4, 15}), 0);
      assertEquals(isOnionArray.isOnionArray(new int[] {1, 3, 9, 8}), 0);
      assertEquals(isOnionArray.isOnionArray(new int[] {2}), 1);
      assertEquals(isOnionArray.isOnionArray(new int[] {}), 1);
      assertEquals(isOnionArray.isOnionArray(new int[] {-2, 5, 0, 5, 12}), 1);
  }
}
