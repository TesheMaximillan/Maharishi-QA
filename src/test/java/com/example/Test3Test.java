package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3Test {
  @Test
  public void testIsTest3() {
    Test3 test3 = new Test3();
    assertEquals(test3.isTest3(1), 1);
    assertEquals(test3.isTest3(3), 1);
    assertEquals(test3.isTest3(6), 1);
    assertEquals(test3.isTest3(10), 1);
    assertEquals(test3.isTest3(7), 0);
  }
}
