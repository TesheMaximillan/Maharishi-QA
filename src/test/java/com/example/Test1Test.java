package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1Test {
  @Test
  public void testIsTest1() {
    Test1 test1 = new Test1();
    assertEquals(test1.isTest1(new int[] { 1, 2, 10, 3, 15, 1, 2, 2 }), 0);
    assertEquals(test1.isTest1(new int[] { 5, 2, 10, 3, 15, 1, 2, 2 }), 1);
    assertEquals(test1.isTest1(new int[] { 1, 2, 10, 3, 15, 16, 2, 2 }), 1);
    assertEquals(test1.isTest1(new int[] { 3, 2, 18, 1, 0, 3, -11, 1, 3 }), 0);
    assertEquals(test1.isTest1(new int[] { 2, 3, 1, 1, 18 }), 1);
    assertEquals(test1.isTest1(new int[] { 8, 2, 1, 1, 18, 3, 5 }), 1);
    assertEquals(test1.isTest1(new int[] { 3, 3, 3, 3, 3, 3 }), 1);
    assertEquals(test1.isTest1(new int[] { 1 }), 1);
    assertEquals(test1.isTest1(new int[] {  }), 1);
  }
}
