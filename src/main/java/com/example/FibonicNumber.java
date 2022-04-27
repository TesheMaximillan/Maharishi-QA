package com.example;

public class FibonicNumber {
  public int closestFibonacci(int n)  {
    int first = 1, second = 1;
    int fibonicNumber = 1;
    if (n < 1) return 0;

    while (true) {
      fibonicNumber = first + second;
      if(fibonicNumber > n) break;
      first = second;
      second = fibonicNumber;
    }

    return second;
  };
}
