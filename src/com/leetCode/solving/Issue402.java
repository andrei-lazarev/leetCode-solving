package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/remove-k-digits">
 *   402. Remove K Digits</a>
 */
public class Issue402 {
  public static void main(String[] args) {
    String num = "112";
    int k = 1;

    System.out.println("Given an integer k and string num representing a non-negative integer num:\n"
      + "k = " + k + ", num = "+ num
      + "\nThe smallest possible integer after removing k digits from num\n"
      + removeKdigits(num, k));
  }

  public static String removeKdigits(String num, int k) {
    if (num.length() == k)
      return "0";
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < num.length(); i++) {
      while(
        result.length() > 0
          && k > 0
          && result.charAt(result.length()-1) > (num.charAt(i))
      ) {
        result.deleteCharAt(result.length()-1);
        k--;
      } result.append(num.charAt(i));
    }

    if (k > 0) {
      result.delete(result.length()-k, result.length());
    }

    while(result.length() > 1 && result.charAt(0) == '0') {
      result.delete(0, 1);
    }

    return new String(result);
  }
}
