package com.example;

public class TowerOfHanoi {
  public void TOH(int n, int A, int B, int C)  {
    if(n > 0) {
      TOH(n-1, A, C, B);
      System.out.printf("(%d - %d)\t", A, C);
      TOH(n-1, B, A, C);
    }
  };

  public static void main(String[] args) {
    TowerOfHanoi toh = new TowerOfHanoi();
    toh.TOH(3, 1, 2, 3);
  }
}
