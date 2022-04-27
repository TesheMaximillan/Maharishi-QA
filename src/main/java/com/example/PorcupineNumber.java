package com.example;

public class PorcupineNumber {
    /**
   * @param n the starting point to check the porcupine number
   * @return the first procupine number
   */

   public boolean isPrime (int n) {
     return true;
   }

  public int porcupineNumber(int n) {
    for (int i = n+1; ; i++) {
      if (isPrime(i) && i % 10 == 9) {
        for (int j = i+1; ;j++) {
          if(isPrime(j)) {
            if (j % 10 == 9) return i;
            break;
          }
        }
      }
    }
  }
}
