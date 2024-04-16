package com.leetCode.tests;

import com.leetCode.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static com.leetCode.solving.Issue129.sumNumbers;
import static org.junit.jupiter.api.Assertions.*;

class Issue129Test {

  @Test
  void sumNumbersTest() {
    assertEquals(1026, sumNumbers(new TreeNode(new Integer[]{4, 9, 0, 5, 1})));
    assertEquals(25, sumNumbers(new TreeNode(new Integer[]{1, 2, 3})));
  }
}
