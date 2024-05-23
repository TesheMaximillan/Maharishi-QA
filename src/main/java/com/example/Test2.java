package com.example;

public class Test2 {
  public int isTest2(int[] a) {
    /*
     * An array is defined to be a 235 array if the number of elements divisible by
     * 2 plus the number of elements divisible by 3 plus the number of elements
     * divisible by 5 plus the number of elements not divisible by 2, 3, or 5 is
     * equal to the number of elements of the array. Write a method named is235Array
     * that returns 1 if its array argument is a 235 array, otherwise it returns 0.
     */

    int count2;
    int count3;
    int count5;
    int countOther;
    int totalCount;

    count2 = count3 = count5 = countOther = totalCount = 0;

    for (int element : a) {
      if (element % 2 == 0) {
        count2++;
      }
      if (element % 3 == 0) {
        count3++;
      }
      if (element % 5 == 0) {
        count5++;
      }
      if (element % 2 != 0 && element % 3 != 0 && element % 5 != 0) {
        countOther++;
      }
    }

    totalCount = count2 + count3 + count5 + countOther;

    return totalCount == a.length ? 1 : 0;
  }
}
