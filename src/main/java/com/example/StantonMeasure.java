package com.example;

public class StantonMeasure {
    /**
   * @param a seqence of numbers which is checked for stanton;
   * @return stanton measure
   */

  public int stantonMeasure(int[] a) {
    int stanton = 0;
    int countOne = 0;

    for(int i : a) if (i == 1) countOne++;

    for(int i : a) if (i == countOne) stanton++;
    
    return stanton;
  }
}
