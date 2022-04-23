package com.example;

public class PrimeCount {
  /**
   * @param start the starting point to check the prime
   * @param end   the end line to stop checking prime
   * @return the number of prime numbers between start and end
   */
  public int primeCount(int start, int end) {
    int primeCount = 0;
    if (start <= end && end > 1) {
      boolean isPrime = true;
      if (start < 2) start = 2;
      for (int i = start; i <= end; i++) {
        isPrime = true;
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime) primeCount++;
      }
    }
    return primeCount;
  }
}
