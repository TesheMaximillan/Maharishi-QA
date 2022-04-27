package com.example;

public class Solve10 {
      /**
   * @return an array of two values their sum equals 10!
   */

  public int factorial(int n) {
    if (n <= 1) return 1; 
    else return n*factorial(n-1);
  }

  public int[] solve10() {
    int[] a = new int [2];
    int num = 10;
    int iFactorial = 0;
    int jFactorial = 0;
    int fact10 = factorial(num);
    
    for (int i = 2; i < num ;i++) {
      iFactorial = factorial(i);
      for (int j = num-1; j >= 1; j--) {
        jFactorial = factorial(j);
        if(iFactorial + jFactorial == fact10) {
          a[0] = i;
          a[1] = j;
          return a;
        }
      }
    }
    return a;
  };

	public static void main(String[] args){
    Solve10 solve10 = new Solve10();
		int[] result = solve10.solve10();
		for(int number : result){
			System.out.println(number);
		}

    // Solve10 factorial = new Solve10();
    // int result = factorial.factorial(3);
    // System.out.println(result);
	}
}
