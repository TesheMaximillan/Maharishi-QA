package com.example;

public class Test3 {
  /*
   * A number n is triangular if n == 1 + 2 +...+j for some j. Write a function
   * int isTriangular(int n) that returns 1 if n is a triangular number, otherwise
   * it returns 0. The first 4 triangular numbers are 1 (j=1), 3 (j=2), 6, (j=3),
   * 10 (j=4).
   */
  public int isTest3(int n) {
    if (n < 1) return 0;
    /*
     * n = j * (j + 1) / 2
     * first find j such that j * (j + 1) < 2 * n
     * if j * (j + 1) == 2 * n, then n is a triangular number
     * if j * (j + 1) > 2 * n, then n is not a triangular number
     * 
     */

    int j = 1;
    while (j * (j + 1) < 2 * n) {
      j++;
    }

    if (j * (j + 1) != 2 * n) {
      return 0;
    }
    
    return 1;
  }
}
