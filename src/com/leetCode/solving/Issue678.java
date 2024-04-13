package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/valid-parenthesis-string/">
 *   678. Valid Parenthesis String</a>
 */
public class Issue678 {
  public static void main(String[] args) {
    String st = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
    System.out.println(
      "Given a string s containing only three types of characters: '(', ')' and '*': \n" + st +
      "\nThis string is : " + (checkValidString(st)  ? "VALID" : "IS NOT VALID"));
  }

  public static boolean checkValidString(String s) {
    int leftMin = 0, leftMax = 0;

    for (char c : s.toCharArray()) {
      if (c == '(') {
        leftMin++;
        leftMax++;
      } else if (c == ')') {
        leftMin--;
        leftMax--;
      } else {
        leftMin--;
        leftMax++;
      }
      if (leftMax < 0) return false;
      if (leftMin < 0) leftMin = 0;
    }

    return leftMin == 0;
  }
}
