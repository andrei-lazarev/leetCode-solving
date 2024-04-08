package com.leetCode.solving;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/number-of-students-unable-to-eat-lunch">
 *   1700. Number of Students Unable to Eat Lunch</a>
 */
public class Issue1700 {
  public static void main(String[] args) {
/*    //case1
    int[] students = {1,1,0,0};
    int[] sandwiches = {0,1,0,1};*/
    //case2
    int[] students = {1,1,1,0,0,1};
    int[] sandwiches = {1,0,0,0,1,1};
    System.out.println("Given two integer arrays students and sandwiches:"
      + "\nstudents: " + Arrays.toString(students)
      + "\nsandwiches: " + Arrays.toString(sandwiches)
      + "\nThe number of students that are unable to eat: " + countStudents(students,sandwiches));
  }

  public static int countStudents(int[] students, int[] sandwiches) {
    int ones = 0, zeros = 0;
    for (int i : students) {
      ones += i;
      zeros += (1 - i);
    }
    for (int i : sandwiches) {
      if (i == 1 && ones > 0) {
        ones--;
      } else if (i == 0 && zeros > 0) {
        zeros--;
      } else {
        break;
      }
    }
    return ones + zeros;
  }
//worse naive head-on solution
/*public static int countStudents(int[] students, int[] sandwiches) {
    int countStudents = students.length;
    int hungryStudents = 0;
    for (int i = 0; i < countStudents; i++) {
      int studentPrefers = students[0];
      if(students[0] == sandwiches[0]) {
        students = Arrays.copyOfRange(students, 1, students.length);
        sandwiches = Arrays.copyOfRange(sandwiches, 1, sandwiches.length);
        countStudents = students.length;
        hungryStudents = 0;
        i--;
      } else {
        students = Arrays.copyOfRange(students, 1, students.length);
        students = Arrays.copyOf(students, students.length+1);
        students[students.length - 1] = studentPrefers;
        hungryStudents++;
        i--;
      }
      if (countStudents == 0) return 0;
      if (hungryStudents == countStudents) return hungryStudents;
    }
    return countStudents;
  }*/
}
