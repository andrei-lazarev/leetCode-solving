package com.leetCode.solving;

import java.util.Arrays;

public class Issue2057 {
  public static void main(String[] args) {
    int[] nums = {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
    System.out.println("Given a 0-indexed integer array nums[]="+ Arrays.toString(nums)
      +"\nsmallest index i such that i mod 10 == nums[i] = " + new Solution().smallestEqual(nums)
    );
  }

  public static class Solution{
    public int smallestEqual(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
        if (i % 10 == nums[i])
          return i;
      }
      return -1;
    }
  }
}
