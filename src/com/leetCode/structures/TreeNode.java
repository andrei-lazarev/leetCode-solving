package com.leetCode.structures;


import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;
  TreeNode() {}
  public TreeNode(int val) { this.val = val; }
  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public TreeNode(Integer[] arr){
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Array cannot be null or empty");
    }
    this.val = arr[0];
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(this);
    for (int i = 1; i < arr.length; i += 2) {
      TreeNode node = queue.poll();
      if (arr[i] != null) {
        node.left = new TreeNode(arr[i]);
        queue.add(node.left);
      }
      if (i + 1 < arr.length && arr[i + 1] != null) {
        node.right = new TreeNode(arr[i + 1]);
        queue.add(node.right);
      }
    }
  }
  @Override
  public String toString() {
    return "TreeNode{" +
      "val=" + val +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}
