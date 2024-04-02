package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/add-two-integers">
 *   2235. Add Two Integers</a>
 */
public class Issue2235 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = -6;
    System.out.println("Given two integers " + num1
      + " and " + num2
      + "\nThe sum of the two integers = " + sum(num1, num2)
    );
  }

  public static int sum(int num1, int num2) {
    return num1 + num2;
  }
}
