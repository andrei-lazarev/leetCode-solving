package com.leetCode.solving;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode.com/problems/minimum-rectangles-to-cover-points">
 *   3111. Minimum Rectangles to Cover Points</a>
 */
public class Issue3111 {
  public static void main(String[] args) {
    //case1
//    int[][] points = {{2,1},{1,0},{1,4},{1,8},{3,5},{4,6}};
//    int w = 1;
    //case2
//    int[][] points = {{0,0},{1,1},{2,2},{3,3},{4,4},{5,5},{6,6}};
//    int w = 2;
    // case3
    int[][] points = {{4,3},{1,2}};
    int w = 0;
    System.out.println("\nMinimum Rectangles to Cover Points = " + minRectanglesToCoverPoints(points,w));
  }

  public static int minRectanglesToCoverPoints(int[][] points, int w) {
    int res = 0;
    Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

    int temp = -1;
    for (int[] point : points) {
        if (point[0] > temp) {
            temp = point[0] + w;
            res++;
        }
    }
    return res;
  }
}
