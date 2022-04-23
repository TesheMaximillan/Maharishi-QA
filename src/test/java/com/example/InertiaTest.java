package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InertiaTest {
  
  @Test
  public void testIsInertia() {
      Inertial inertia = new Inertial();
      assertEquals(inertia.isInertia(new int[]{1}), 0);
      assertEquals(inertia.isInertia(new int[]{2}), 0);
      assertEquals(inertia.isInertia(new int[]{1, 2, 3, 4}), 0);
      assertEquals(inertia.isInertia(new int[]{1, 1, 1, 1, 1, 1, 2}), 1);
      assertEquals(inertia.isInertia(new int[]{2, 12, 4, 6, 8, 11}), 1);
      assertEquals(inertia.isInertia(new int[]{2, 12, 12, 4, 6, 8, 11}), 1);
      assertEquals(inertia.isInertia(new int[]{-2, -4, -6, -8, -11}), 0);
      assertEquals(inertia.isInertia(new int[]{2, 3, 5, 7}), 0);
      assertEquals(inertia.isInertia(new int[]{2, 4, 6, 8, 10} ), 0);
  }
}
