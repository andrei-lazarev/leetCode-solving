package com.leetCode.solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/number-of-good-pairs"
 * >1512. Number of Good Pairs</a>
 **/
public class Issue1512 {
  public static void main(String[] args) {
    int[] nums = new int[] {0,1,2,0,3,1,1,3};

    System.out.println("So we have nums[]=" + Arrays.toString(nums)
      + "\nThere are " + numIdenticalPairs(nums) + " good pairs."
      );
  }

  public static int numIdenticalPairs(int[] nums) {
    Map<Integer, Integer> pairs = new HashMap<>();
    int ans = 0;

    for (int num : nums) {
        if (pairs.containsKey(num)) {
            ans += pairs.get(num);
        }
        pairs.put(num, pairs.getOrDefault(num, 0) + 1);
    }

    return ans;
  }

  //better
/*  public static int numIdenticalPairs(int[] nums) {
    int ans = 0;
    int cntMap[] = new int[128];
    for (int num : nums) {
      ans += cntMap[num];
      cntMap[num]++;
    }
    return ans;
  }*/

  //slowest
/*  public static int numIdenticalPairs(int[] nums) {
    int result=0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j] && i < j)
          result++;
      }
    }
    return result;
  }*/
}
