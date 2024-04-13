package com.leetCode.solving;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode.com/contest/biweekly-contest-128/">
 *   Biweekly Contest 128</a>
 */
public class BiweeklyContest128 {
  public static void main(String[] args) {
    //100270. Score of a String
    String str = "hello";
    System.out.println("Score of a String = "+ scoreOfaString(str));
    //100280. Minimum Rectangles to Cover Points
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

//100270. Score of a String
  public static int scoreOfaString(String str) {
    int res = 0;
    for (int i = 0; i < str.length()-1; i++) {
      res += Math.abs(str.charAt(i) - str.charAt(i+1));
    }
    return res;
  }

  //100280. Minimum Rectangles to Cover Points
  public static int minRectanglesToCoverPoints(int[][] points, int w) {
    int res = 0;
    Arrays.sort(points, Comparator.comparingInt(o -> o[0]));//Arrays.sort(points, (a, b)->a[0] - b[0]);

    int temp = points[0][0] + w;
    for (int i = 0; i < points.length; i++) {
      if (points[i][0] > temp || i == points.length-1) {

        if(i == points.length-1 && points[i][0] <= temp) {
          res++;
        } else {
          temp = points[i][0] + w;
          res++;
          i--;
        }
      }
    }
    return res;
  }

}
