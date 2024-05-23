package com.example;

public class perfectSquare2 {
  // n = 6, next perfect square 9
  // n = 36, next perfect square 49
  // 0 = 1
  // -5 = 0

  public int isNextPerfectSquare (int n) {
    int nextPerfectSquare = 0;
    if (n < 0) nextPerfectSquare = 0;
    else if (n == 0) nextPerfectSquare = 1;
    else {
      double sqrt = Math.sqrt(n);
      if (sqrt % 1 == 0) {
        nextPerfectSquare = (int) Math.pow(sqrt + 1, 2);
      } else {
        nextPerfectSquare = (int) Math.pow(Math.ceil(sqrt), 2);
      }
    }

    return nextPerfectSquare;
  }
}
