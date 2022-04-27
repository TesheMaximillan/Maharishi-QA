package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GutehricTest {
  @Test
  public void testIsGutheric() {
      Gutheric gutheric = new Gutheric();
      assertEquals(gutheric.isGuthericArray(new int[]{8, 4, 2, 1}), 1);
      assertEquals(gutheric.isGuthericArray(new int[]{8, 17, 4, 1}), 0);
      assertEquals(gutheric.isGuthericArray(new int[]{8, 4, 1}), 0);
      assertEquals(gutheric.isGuthericArray(new int[]{8, 4, 2}), 0);
  }

}
