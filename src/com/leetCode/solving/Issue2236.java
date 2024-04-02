package com.leetCode.solving;

import com.leetCode.structures.TreeNode;

/**
 * <a href="https://leetcode.com/problems/root-equals-sum-of-children">
 *   2236. Root Equals Sum of Children</a>
 */
public class Issue2236 {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(
      10,
      new TreeNode(4, null, null),
      new TreeNode(6, null,null));

    System.out.println("Given the root " + root +
      "\nof a binary tree that consists of exactly 3 nodes:" +
      " the root, its left child, and its right child." +
      "\nThe value of the root is equal to the sum of the values of its two children : "
      + checkTree(root)
    );
  }

  public static boolean checkTree(TreeNode root) {
    return root.val == root.left.val + root.right.val;
  }
}
