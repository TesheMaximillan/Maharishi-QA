package com.example;

public class Madhav {
    
  /**
   * @param start the starting point to check the prime
   * @param end   the end line to stop checking prime
   * @return the number of prime numbers between start and end
   */
  public int isMadhavArray(int[] a) {
    int isMadhav = 0, base = a[0], partialSum, n = 2;

    for (int i = 1; i < a.length; ) {
      partialSum = 0;
      if (n * (n + 1)/2 > a.length) return isMadhav;
      for (int j = i; j < n+i; j++) {
        partialSum += a[j];
      }
      if (base != partialSum) return isMadhav;
      i += n;
      n++;
    }
    
    isMadhav = 1;
    return isMadhav;
  }
}
