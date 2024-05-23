package com.example;

public class PrimeCount2 {
  public int PrimeCount(int start, int end) {
    int primeCount = 0;

    if (start <= end && end > 1) {
      boolean isPrime = true;
      if (start < 2) start = 2;
      for (int i = start; i <= end; i++) {
        isPrime = true;
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime) primeCount++;
      }
    }

    return primeCount;
  }

  // public int PrimeCount(int start, int end) {
  // int primeCount = 0;
  // boolean isPrime = false;if(end<=1||start>end)return primeCount;

  // while(start<=end)
  // {
  //   isPrime = true;
  //   if (start == 1)
  //     continue;
  //   for (int i = 2; i < start; i++) {
  //     if (start % i == 0) {
  //       isPrime = false;
  //       break;
  //     }
  //     if (isPrime)
  //       primeCount++;
  //   }
  // }

  // return primeCount;
  // }
}


// initialize primeCount = 0
// if start <= end and end > 1
// if start < 2, set start = 2
// for i = start to end
// isPrime = true
// for j = 2 to i
// if i % j == 0
// isPrime = false
// break
// if isPrime, increment primeCount
// return primeCount
// Time Complexity: O(n^2)