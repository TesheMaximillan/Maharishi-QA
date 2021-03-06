package com.example;

public class perfectSquare {

  /**
   * @result perfectSquare
   * @param num the argument which is used to find the next perfect square
   * @return the next perfect square number of num
   */
  // Time Complexity: O(n)
  public int nextPerfectSquare(int num) {
    int perfectSquare = 1;
    if (num == 0) perfectSquare =  1;
    else if (num < 0) perfectSquare = 0; 
    else {
      for (int i = 0; i <= num; i++) {
        perfectSquare = i*i;
        if (perfectSquare  > num) break;
      }  
    }
    return perfectSquare;
  }
}
