package com.leetCode.solving;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/majority-element-ii">
 *   229. Majority Element II</a>
 */
public class Issue229 {
  public static void main(String[] args) {
    int[] nums = {1,2,6,1,4,1,3,1,4};
    System.out.println("For given an integer array " + Arrays.toString(nums)
      +" of size " + nums.length
      +", there is array "+ new Solution().majorityElement(nums)
      + " of elements that appear more than [ " + (nums.length/3) +" ] (arrays size/3) times .");
  }

  public static class Solution {
    List<Integer> resp = new ArrayList<>();
    int pivot = 0;
    public List<Integer> majorityElement(int[] nums) {
      int len = nums.length;
      pivot = len/3;
      quickSort(nums, 0 , nums.length-1);
      return resp;
    }

    public void quickSort(int[] nums, int start, int end) {
      if(end-start < pivot) {
        return;
      }
      int left = start;
      int right = end;
      int i = start+1;
      while (right >= i) {
        if (nums[left] > nums[i]) {
          swap(nums, left, i);
          i++;
          left++;
        } else if (nums[left] < nums[i]) {
          if (nums[i] > nums[right]) {
            swap(nums, i, right);
          }
          right--;
        } else {
          i++;
        }
      }
      if(right-left >= pivot) {
        resp.add(nums[right]);
      }
      quickSort(nums, start, left-1);
      quickSort(nums, right+1, end);
    }

    public void swap(int[] nums, int i, int j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
  }

  public static class SlowerSolution {
    public List<Integer> majorityElement(int[] nums) {
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

}
