package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/score-of-a-string">
 *   3110. Score of a String</a>
 */
public class Issue3110 {
  public static void main(String[] args) {
    //100270. Score of a String
    String str = "hello";
    System.out.println("Score of a String = "+ scoreOfaString(str));
  }

  public static int scoreOfaString(String str) {
    int res = 0;
    for (int i = 0; i < str.length()-1; i++) {
      res += Math.abs(str.charAt(i) - str.charAt(i+1));
    }
    return res;
  }
}
