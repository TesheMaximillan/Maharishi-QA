package com.example;

public class Madhav {
    
  /**
   * @param a   array elements checked for madhave condition
   * @return 1 if the array is madhav else return 0
   */
  // Time Complexity: O(n^2)
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
