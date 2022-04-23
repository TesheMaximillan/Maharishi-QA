package com.example;

public class NupCount {
    /**
   * @result perfectSquare
   * @param a  the argument which is the collection of numbers
   * @param num the edge to be upconunt
   */
  public int upCount(int[] a, int num) {
    int upcount = 0;
    int prevSum =a[0];
    int partialSum = 0;

    for (int i : a) {
      prevSum = partialSum;
      partialSum +=  i;
      if (prevSum <= num && partialSum > num ) upcount++;
    }

    return upcount;
  }
}
