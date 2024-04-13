package com.leetCode.solving;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/remove-digit-from-number-to-maximize-result">
 *   2259. Remove Digit From Number to Maximize Result</a>
 */
public class Issue42 {
  public static void main(String[] args) {
//    int[] height = {4,2,0,3,2,5}; //expected 9
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1}; //expected 6

    System.out.println("Given n non-negative integers representing an elevation map where the width of each bar is 1:\n"
      + "height = " + Arrays.toString(height)
      + "\nIt can trap after raining: \n"
      + trap(height));
  }


  public static int trap(int[] height) {
    int res = 0;
    int left = 0, right = height.length - 1;
    int leftMax = height[left];
    int rightMax = height[right];
    while (left < right){
      if (leftMax < rightMax) {
        left++;
        leftMax = Math.max(leftMax, height[left]);
        res += leftMax - height[left];
      } else {
        right--;
        rightMax = Math.max(rightMax, height[right]);
        res += rightMax - height[right];
      }
    }
    return res;
  }

  //slow solution
  /*
  public static int trap(int[] height) {
    int res = 0;
    int leftHeight = 0, rightHeight = 0;
    int trappedWater = 0;
    for (int i = 0; i < height.length; i++) {
      if (leftHeight == 0
          && height[i] > 0){
        leftHeight = height[i];
        continue;
      }
      if (leftHeight != 0
          && rightHeight == 0){
        int j = i;
        while (rightHeight == 0){
          trappedWater += Math.max(leftHeight - height[i], 0);
          if (leftHeight <= height[i]){
            rightHeight = height[i];
          } else i++;
          if (i == height.length){
            i = j;
            leftHeight--;
            trappedWater = 0;
          }
          if (leftHeight == 0)
            break;
        }

        res += trappedWater;
        trappedWater=0;
        leftHeight = rightHeight;
        rightHeight = 0;
      }
    }
    return res;
  }
  */
}
