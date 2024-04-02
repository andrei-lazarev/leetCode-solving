package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/isomorphic-strings">
 *   205. Isomorphic Strings</a>
 */
public class Issue205 {
  public static void main(String[] args) {
//    String s = "paper";
//    String t = "title";
    String s = "foo";
    String t = "bar";

    System.out.println("Given two strings s=\""+ s
      + "\" and t=\"" + t + "\""
      + "\nThey are " + (isIsomorphic(s, t) ? "" : "not ") +"isomorphic."
    );
  }

  // the first solution
/*  public static boolean isIsomorphic(String s, String t) {
    char[] sArray = s.toCharArray();
    int[] sMask = new int[s.length()];
    char[] tArray = t.toCharArray();
    int[] tMask = new int[t.length()];

    int maskHelper = 0;
    for (int i = 0; i < sArray.length; i++) {
      if(sMask[i] == 0) {
        maskHelper++;
        for (int j = 0; j < sArray.length; j++) {
          if(sArray[i] == sArray[j])
            sMask[j] = maskHelper;
          if(tArray[i] == tArray[j])
            tMask[j] = maskHelper;
          if(sMask[j] != tMask[j])
            return false;
        }
      }
    }

    return true;
  }*/
  //the second option, time and space complexity: O(n)
  public static boolean isIsomorphic(String s, String t) {
    if(s.length() != t.length())
      return false;
    int[] sPositions = new int[127];
    int[] tPositions = new int[127];

    for (int i = 0; i < s.length(); i++) {
      if (sPositions[s.charAt(i)] != tPositions[t.charAt(i)]) {
        return false;
      }
      sPositions[s.charAt(i)] = i + 1;
      tPositions[t.charAt(i)] = i + 1;
    }
    return true;
  }
}
