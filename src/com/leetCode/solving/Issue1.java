package com.leetCode.solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum">
 *   1. Two Sum</a>
 */
public class Issue1 {
  public static void main(String[] args) {
    int[] nums = {-1,-2,-3,-4,-5};
    int target = -8;
    System.out.println("Given an array of integers nums = " + Arrays.toString(nums)
      + "\nAnd an integer target = " + target
      + "\nSo indices of the two numbers such that they add up to target: "
        + Arrays.toString(twoSum(nums, target)));
  }

  //solution using hash map
  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    int n = nums.length;
    int c;
    for(int i = 0; i < n; i++){
      c = target - nums[i];
      System.out.println("c="+c);
      if(numMap.containsKey(c)){
        return new int[]{numMap.get(c), i};
      }
      numMap.put(nums[i], i);
      System.out.println("numMap="+numMap);
    }
    return new int[]{};
  }
  //slow solution
  /*public static int[] twoSum(int[] nums, int target) {
    int[] result = {0, 0};
    int sumInLoop = 0;
    for (int i = nums.length-1; i > 0; i--) {
      for (int j = i; j >= 0 ; j--) {
        sumInLoop+=nums[j];
        if (sumInLoop == target && i!=j) {
          return new int[] {j, i};
        }
        if (i != j) sumInLoop -= nums[j];
      }
      sumInLoop=0;
    }
    return result;
  }*/
}
