package com.example;

public class HasSingleMaximum {
  /**
   * @param a seqence of numbers which is checked for gutheric or not;
   * @return 0 if if the list is not gutheric else return 1
   */

  public int hasSingleMaximum(int[] a) {
    int countMax = 0;
    if (a.length < 1) return 0;
    int max = a[0];
    
    for (int i : a) {
      if (max < i) max = i;
    }

    for (int i : a) {
      if (max == i) countMax++;
    }

    if (countMax > 1) return 0;

    return 1;
  };
}
