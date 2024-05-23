package com.example;

public class Madhav {

  /**
   * @param a array elements checked for madhave condition
   * @return 1 if the array is madhav else return 0
   */
  // Time Complexity: O(n^2)
  public int isMadhavArray(int[] a) {
    // int isMadhav = 0, base = a[0], partialSum, n = 2;

    // for (int i = 1; i < a.length; ) {
    // partialSum = 0;
    // if (n * (n + 1)/2 > a.length) return isMadhav;
    // for (int j = i; j < n+i; j++) {
    // partialSum += a[j];
    // }
    // if (base != partialSum) return isMadhav;
    // i += n;
    // n++;
    // }

    // isMadhav = 1;
    // return isMadhav;

    // ============ solution 2 ===============
    // int sum = 0;
    // int n = 0;
    // int length = a.length;

    // for (int i = 0; i < length;) {
    // n++;
    // int partialSum = 0;
    // for (int j = 0; j < n; j++) {
    // if (i >= length) // If the array ends prematurely
    // return 0;
    // partialSum += a[i];
    // i++;
    // }
    // if (n == 1) {
    // sum = partialSum;
    // } else {
    // if (sum != partialSum) // If the sums are not equal
    // return 0;
    // }
    // }

    // return (length == n * (n + 1) / 2) ? 1 : 0;

    int base = a[0], n = 1, partialsum = 0;

    for (int i = 1; i < a.length; i += n) {
      n++;
      if (n + i > a.length)
        return 0;

      for (int j = i; j < n + i; j++) {
        partialsum += a[j];
      }

      if (base != partialsum)
        return 0;

      partialsum = 0;
    }

    return n * (n + 1) / 2 == a.length ? 1 : 0;
  }
}
