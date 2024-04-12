package com.leetCode.solving;

/**
 * <a href="https://leetcode.com/problems/remove-digit-from-number-to-maximize-result">
 *   2259. Remove Digit From Number to Maximize Result</a>
 */
public class Issue2259 {
  public static void main(String[] args) {
    String number = "2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471";
    char digit = '3';

    System.out.println("Given given a string number representing a positive integer and a character digit:\n"
      + "digit = " + digit + ", number = "+ number
      + "\nThe resulting string after removing exactly one occurrence of digit from number \n"
      + removeDigit(number, digit));
  }


  //without comparing -> faster
  public static String removeDigit(String number, char digit) {
    int index = 0,n=number.length();
    for(int i=0;i<n;i++){
      if(number.charAt(i)==digit){
        index = i;
        if(i<n-1 && digit < number.charAt(i+1)) break;
      }
    }
    number = number.substring(0, index) + number.substring(index+1);
    return number;
  }
  //with comparing
/*  public static String removeDigit(String number, char digit) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < number.length(); i++) {
      if (number.charAt(i) == digit
          && res.length() > 0
          && (String.copyValueOf(number.toCharArray(), 0, i)
               + String.copyValueOf(number.toCharArray(), i + 1, number.length() - i - 1)
              ).compareTo(String.valueOf(res)) > 0) {
        res = new StringBuilder();
        res.append(number).deleteCharAt(i);
      } else if (number.charAt(i) == digit && res.length() == 0)
        res.append(number).deleteCharAt(i);
    }
    return new String(res);
  }*/
}
