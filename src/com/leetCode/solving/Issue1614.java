package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses">
 *   1614. Maximum Nesting Depth of the Parentheses</a>
 */
public class Issue1614 {
  public static void main(String[] args) {
    String s  = "(1+(2*3)+((8)/4))+1";
    System.out.println("Given string: " + s
      + "\nThe nesting depth of given string is: " + maxDepth(s));
  }

  public static int maxDepth(String s) {
    char[] sArray = s.toCharArray();
    int d = 0;
    int temp = 0;
    for (char c : sArray) {
        if (c == '(') temp++;
        if (c == ')') temp--;
        if (temp > d) {
            d = temp;
        }
    }

    return d;
  }
}
