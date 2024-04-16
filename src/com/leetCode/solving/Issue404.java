package com.leetCode.solving;

import com.leetCode.structures.TreeNode;

/**
 * <a href="https://leetcode.com/problems/sum-of-left-leaves">
 * 404. Sum of Left Leaves</a>
 */
public class Issue404 {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(new Integer[]{3,9,20,null,null,15,7});

    System.out.println("Given the root of a binary tree:\n" + root +
      "\nThe sum of all left leaves : "
      + sumOfLeftLeaves(root)
    );
  }

  public static int sumOfLeftLeaves(TreeNode root) {
    return countLeftLeaves(root.left, true) + countLeftLeaves(root.right, false);
  }

  private static int countLeftLeaves(TreeNode root, boolean parentIsLeft) {
    if (root == null)
      return 0;
    int sum = 0;

    if (root.left == null && root.right == null && parentIsLeft) {
      sum += root.val;
    }

    if (root.left != null) {
      sum += countLeftLeaves(root.left, true);
    }

    if (root.right != null) {
      if (root.right.left != null) {
        sum += countLeftLeaves(root.right.left, true);
      }
      if (root.right.right != null) {
        sum += countLeftLeaves(root.right.right, false);
      }
    }
    return sum;
  }
}
