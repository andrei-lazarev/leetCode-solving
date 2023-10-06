package com.leetCode.solving;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/majority-element-ii">
 *   229. Majority Element II</a>
 */
public class Issue229 {
  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3,3};
    System.out.println("For given an integer array " + Arrays.toString(nums)
      +" of size " + nums.length +
      ", there are "+ majorityElement(nums)
      + " elements that appear more than [ " + (nums.length/3) +" ] (arrays size/3) times .");
  }

  public static List<Integer> majorityElement(int[] nums) {
    List<Integer> output = new ArrayList<>();
    int threshold = nums.length/3;
    Map<Integer,Integer> appearings = new HashMap<>();

    for (int num : nums){
      appearings.put(num, appearings.getOrDefault(num,0)+1);
      int value = appearings.getOrDefault(num,0);
      if(value != 0 && value > threshold && !output.contains(num)){
        output.add(num);
      }
    }
    return output;
  }
}
