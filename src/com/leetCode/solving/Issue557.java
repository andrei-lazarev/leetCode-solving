package com.leetCode.solving;


/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii">
 *   557. Reverse Words in a String III</a>
 */
public class Issue557 {
  public static void main(String[] args) {
    String inputStr = "Let's take LeetCode contest";
    System.out.println("Initial string=" + inputStr
      +"\nReversed string=" + reverseWords(inputStr));
  }

  public static String reverseWords(String s) {
    String[] arr = s.split(" ");
    StringBuilder output = new StringBuilder();
    for(String w : arr){
      for(int i = w.length() - 1; i >= 0; i--){
        output.append(w.charAt(i));
      }
      output.append(" ");
    }
    return String.valueOf(output).trim();
  }
}
