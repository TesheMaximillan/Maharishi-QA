package com.example;

public class Gutheric {
    /**
   * @param a seqence of numbers which is checked for gutheric or not;
   * @return 0 if if the list is not gutheric else return 1
   */

  public int isGuthericArray(int[] a) {
    if(a[a.length-1] != 1) return 0;
    for(int i=0; i < a.length-1; i++) {
      if(a[i] % 2 == 0) {
        if(a[i] /2 != a[i+1]) return 0;
      } else {
        if(a[i]*3+1 != a[i+1]) return 0;
      }
    }
    return 1;
  };
}
