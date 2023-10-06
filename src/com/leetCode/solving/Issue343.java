package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/integer-break">
 *   343. Integer Break</a>
 */
public class Issue343 {
  public static void main(String[] args) {
    int n = 9;
    System.out.println("n = " + n
      + "\nThe maximum product you can get is " + integerBreak(n)
    );
  }

  public static int integerBreak(int n) {
    if (n <= 3) {
      return n - 1;
    }

    int a = n / 3;
    int r = n % 3;

    if (r == 0)
      return (int) Math.pow(3, a);
    else if (r == 1)  return (int) Math.pow(3, a-1)*4;
    else return (int) Math.pow(3, a)*2;

    // 2 = 1*1 = 1
    // 3 = 1*2 = 2
    // 4 = 2*2 = 4
    // 5 = 2*3 = 6
    // 6 = 3*3 = 9
    // 7 = 3*4 = 12
    // 8 = 3*3*2 = 18
    // 9 = 3*4*2   = 24
    // 10 = 3*3*4  = 36
    // 11 = 3*3*3*2 = 54
    // 12 = 3*3*3*3 = 81
  }
}
