package com.leetCode.tests;

import com.leetCode.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static com.leetCode.solving.Issue404.sumOfLeftLeaves;
import static org.junit.jupiter.api.Assertions.*;

class Issue404Test {

  @Test
  void sumOfLeftLeavesTest() {
    assertEquals(24, sumOfLeftLeaves(new TreeNode(new Integer[]{3,9,20,null,null,15,7})));
    assertEquals(0, sumOfLeftLeaves(new TreeNode(new Integer[]{1})));
    assertEquals(0, sumOfLeftLeaves(new TreeNode(new Integer[]{1,null,2})));
    assertEquals(2, sumOfLeftLeaves(new TreeNode(new Integer[]{1,2})));
    assertEquals(0, sumOfLeftLeaves(new TreeNode(new Integer[]{2,null,3,null,4,null,5,null,6})));
    assertEquals(5, sumOfLeftLeaves(new TreeNode(new Integer[]{0,2,4,1,null,13,-1,5,1,null,6,null,8})));
    assertEquals(-11, sumOfLeftLeaves(new TreeNode(new Integer[]{-9,-3,2,null,4,4,0,-6,null,-5})));
    assertEquals(2, sumOfLeftLeaves(new TreeNode(new Integer[]{0,-4,-3,null,-1,8,null,null,3,null,-9,-2,null,4})));
  }
}
