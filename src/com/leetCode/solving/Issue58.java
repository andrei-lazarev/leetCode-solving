package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/length-of-last-word">
 *   58. Length of Last Word</a>
 */
public class Issue58 {
  public static void main(String[] args) {
    String s = "   fly me   to   the moon  ";
    System.out.println("Given string S = " + s
      + "\nThe last word of given string with length " + lengthOfLastWord(s)
    );
  }

  public static int lengthOfLastWord(String s){
    int count = 0;
    char[] string = s.toCharArray();

    for(int i = s.length() - 1; i >= 0; i--){
      if(string[i] != ' ') count++;
      if(string[i] == ' ' && count > 0) break;
    }
    return count;
  }
}
