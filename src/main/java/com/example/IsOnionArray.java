package com.example;

public class IsOnionArray {

  public int isOnionArray(int[] a) {
    
    if (a.length <= 1) return 1;

    for (int i = 0, j = a.length-1; i < j; i++, j--) {
      if (a[i] + a[j] > 10) return 0;
    }

    return 1;
  }

  // public static void main(String[] args) {
  //   IsOnionArray isOnionArray = new IsOnionArray();
  //   System.out.println(isOnionArray.isOnionArray(new int[] {1, 2, 19, 4, 5}));
  //   System.out.println(isOnionArray.isOnionArray(new int[] {1, 2, 3, 4, 15}));
    
  //   // ;
  //   // isOnionArray.isOnionArray(new int[] {1, 3, 9, 8});
  //   // isOnionArray.isOnionArray(new int[] {2});
  //   // isOnionArray.isOnionArray(new int[] {});
  //   // isOnionArray.isOnionArray(new int[] {-2, 5, 0, 5, 12});
  // }
}
