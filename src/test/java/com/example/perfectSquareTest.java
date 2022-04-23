package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class perfectSquareTest {
 
  @Test
  public void testPerfectSquare() {
      perfectSquare p = new perfectSquare();
      ;
      assertEquals(p.nextPerfectSquare(6), 9);
      assertEquals(p.nextPerfectSquare(36), 49);
      assertEquals(p.nextPerfectSquare(0), 1);
      assertEquals(p.nextPerfectSquare(-5), 0);
  }

}
