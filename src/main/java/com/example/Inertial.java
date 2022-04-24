package com.example;

public class Inertial {

  /**
   * @param a array parameters to evaluated for inertia
   * @return 1 if it's inertia otherwise it returns 0
   */
  // Time Complexity: O(n)
  public int isInertia(int[] a) {
    if(a.length < 2) return 0;
    int max = a[0], odd = 0;
    int[] oddArray = new int[a.length];

    for (int i : a) {
      if((i % 2) != 0) oddArray[odd++] = i;
      if(i > max) max = i;
    }

    if(max % 2 != 0 || odd < 1) return 0;
    
    for(int i = 0; i < odd; i++) {
        for(int j = 0; j < a.length; j++) {
            if(a[j] % 2 == 0 && a[j] < max && a[j] > oddArray[i]) return 0;
        }
    }

    return 1;
}
}
