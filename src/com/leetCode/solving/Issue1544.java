package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/make-the-string-great/">
 *   1544. Make The String Great</a>
 */
public class Issue1544 {
  public static void main(String[] args) {
    String s = "leEeetcode";
//    String s = "abBAcC";
    System.out.println("Given a string s of lower and upper case English letters: \n" + s
      + "\nSo the string after making it good: \n"
      + (makeGood(s).isEmpty() ? "EMPTY" : makeGood(s)));
  }

  public static String makeGood(String s) {
    if (s.isEmpty() || s.length() == 1)
      return s;
    StringBuilder result = new StringBuilder(s);
    StringBuilder tempStr = new StringBuilder();

    do {
      for (int i = 0; i < result.length(); i++) {
        if (i < result.length()-1
          && (Math.abs(result.charAt(i+1) - result.charAt(i)) == 32))
        {
          i++;
          continue;
        }
        tempStr.append(result.charAt(i));
      }
      result = tempStr;
      tempStr = new StringBuilder();
    }
    while (countPairs(result) > 0);
    return new String(result);
  }

  private static int countPairs(StringBuilder tempStr){
    int pairsCount = 0;
    for (int i = 0; i < tempStr.length(); i++) {
      if (i < tempStr.length()-1
        && (Math.abs(tempStr.charAt(i+1) - tempStr.charAt(i)) == 32))
      {
        pairsCount++;
      }
    }
    return pairsCount;
  }

}
