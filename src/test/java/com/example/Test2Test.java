package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2Test {
  @Test
  public void testIsTest2() {
    Test2 test2 = new Test2();
    assertEquals(test2.isTest2(new int[] { 2, 3, 5, 7, 11 }), 1);
    assertEquals(test2.isTest2(new int[] { 2, 3, 6, 7, 11 }), 0);
    assertEquals(test2.isTest2(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 }), 0);
    assertEquals(test2.isTest2(new int[] { 2, 4, 8, 16, 32 }), 1);
    assertEquals(test2.isTest2(new int[] { 3, 9, 27, 7, 1, 1, 1, 1, 1 }), 1);
    assertEquals(test2.isTest2(new int[] { 7, 11, 77, 49 }), 1);
    assertEquals(test2.isTest2(new int[] { 2 }), 1);
    assertEquals(test2.isTest2(new int[] {}), 1);
    assertEquals(test2.isTest2(new int[] { 7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7 }), 1);
  }
}
