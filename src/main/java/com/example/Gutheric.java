package com.example;

public class Gutheric {
  /**
   * @param a seqence of numbers which is checked for gutheric or not;
   * @return 0 if if the list is not gutheric else return 1
   */

  public int isGuthericArray(int[] a) {
    // if (a[a.length - 1] != 1)
    // return 0;
    // for (int i = 0; i < a.length - 1; i++) {
    // if (a[i] % 2 == 0) {
    // if (a[i] / 2 != a[i + 1])
    // return 0;
    // } else {
    // if (a[i] * 3 + 1 != a[i + 1])
    // return 0;
    // }
    // }
    // return 1;

    if (a[a.length - 1] != 1 || a[0] < 1)
      return 0;
    int n = a[0];

    for (int i = 1; i < a.length; i++) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = n * 3 + 1;
      }

      if (n != a[i])
        return 0;
    }

    return 1;

  };
}
