package com.leetCode.solving;

import com.leetCode.structures.TreeNode;

/**
 * <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers">
 * 129. Sum Root to Leaf Numbers</a>
 */
public class Issue129 {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(new Integer[]{4, 9, 0, 5, 1});

    System.out.println("Given the root of a binary tree containing digits from 0 to 9 only:\n" + root +
      "\nThe total sum of all root-to-leaf numbers : "
      + sumNumbers(root)
    );
  }

  public static int sumNumbers(TreeNode root) {
    return sumLeafInTreeNodes(root, 0);
  }

  private static int sumLeafInTreeNodes(TreeNode root, int prevSum) {
    if (root == null)
      return 0;
    if (root.left == null && root.right == null)
      return root.val + prevSum * 10;
    return sumLeafInTreeNodes(root.left, prevSum * 10 + root.val)
      + sumLeafInTreeNodes(root.right, prevSum * 10 + root.val);
  }
}
