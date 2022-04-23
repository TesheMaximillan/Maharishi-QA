package com.example;

public class SquarePair {
    /**
   * @param a  the argument which is the collection of numbers
   * @return the number of squarePair from array
   */
  public int squarePair(int[] a) {
    int squarePair = 0;
    if (a.length < 2) return squarePair;
    for (int i = 0; i < a.length-1; i++) {
      if( a[i] > 0) {
        for (int j = i+1; j < a.length; j++) {
          if (a[j]> 0) {
            // You may assume that there exists a function named isPerfectSquare that returns 1 if its argument is a perfect square and 0 
            // I used the existing Math function for testing purpose
            int temp =  (int)Math.round(Math.sqrt(a[i] + a[j])); 
            if (temp * temp == a[i] + a[j]) squarePair++;
          }
        }
      }
    }
    return squarePair;
  }
}
