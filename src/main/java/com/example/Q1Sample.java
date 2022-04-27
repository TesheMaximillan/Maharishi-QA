package com.example;

public class Q1Sample {
    
    /**
     * @param a the array list for cheking if it's centered array or not
     * @return the 0 if the array is centered else return 0
     */

     public int isCenteredArray(int[] a) {

      if(a == null || a.length % 2 == 0) return 0;
      else {
        int centeredIndex = a.length/2;
        for(int i = 0; i < a.length; i++ ) {
          if(i != centeredIndex && a[centeredIndex] >= a[i]) return 0;
        }
      }
      return 1;
    }
}
