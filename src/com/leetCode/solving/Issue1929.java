package com.leetCode.solving;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/concatenation-of-array/description">
 *   1929. Concatenation of Array</a>
 */
public class Issue1929 {
  public static void main(String[] args) {
    int[] nums = {-1,-2,-3,-4,-5};
    System.out.println("Given an array of integers nums = " + Arrays.toString(nums)
      + "\nSo concatenation of two nums arrays: \n"
      + Arrays.toString(getConcatenation(nums)));
  }

  //faster solution using arraycopy
  public static int[] getConcatenation(int[] nums) {
    int[] res = new int[nums.length*2];
    System.arraycopy(nums,0, res, 0, nums.length);
    System.arraycopy(nums,0, res, nums.length, nums.length);
    return res;
  }
  //classic slower solution
 /* public static int[] getConcatenation(int[] nums) {
    int[] res = new int[nums.length*2];
    for (int i = 0; i < nums.length * 2; i++) {
      if(i >= nums.length)
        res[i]= nums[i - nums.length];
      else  res[i]= nums[i];
    }
    return res;
  }*/
}
