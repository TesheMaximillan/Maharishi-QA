package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeCountTest {

  @Test
  public void testPrimeCount() {
      PrimeCount primeCount = new PrimeCount();
      assertEquals(primeCount.primeCount(10, 30), 6);
      assertEquals(primeCount.primeCount(11, 29), 6);
      assertEquals(primeCount.primeCount(20, 22), 0);
      assertEquals(primeCount.primeCount(1, 1), 0);
      assertEquals(primeCount.primeCount(5, 5), 1);
      assertEquals(primeCount.primeCount(6, 2), 0);
      assertEquals(primeCount.primeCount(-10, 6), 3);
  }
}
