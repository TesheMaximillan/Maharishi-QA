package com.example;

public class Test1 {
  public int isTest1(int[] a) {
    /*
     * Define an array to be a Mercurial array if a 3 does not occur between any two
     * 1s. Write a function named isMercurial that returns 1 if its array argument
     * is a Mercurial array, otherwise it returns 0.
     */

    if (a.length <= 2) return 1;

    int lastIndex = -1; // index of the last 1

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        if (lastIndex != -1) {
          for (int j = lastIndex + 1; j < i; j++) {
            if (a[j] == 3) {
              return 0;
            }
          }
        }
        lastIndex = i;
      }
    }

    return 1;
  }
}
