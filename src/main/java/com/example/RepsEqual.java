package com.example;

public class RepsEqual {
    /**
   * @param a   array elements checked for madhave condition
   * @return 1 if the array is madhav else return 0
   */
  // Time Complexity: O(n^2)
  public int repsEqual(int[] a, int n) {
    for(int i = a.length-1; i >= 0; i--) {
      if(n % 10 != a[i]) return 0;
      n = n / 10; 
    }
    if(n != 0) return 0;
    return 1;
  }
}
