/*
 * @lc app=leetcode id=450 lang=java
 *
 * [450] Delete Node in a BST
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

  public TreeNode deleteNode(TreeNode root, int key) {
    System.out.println(find(tree, key));
  }

  public TreeNode find(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    if (root.val == key) {
      return root;
    }
    if (root.val > key) {
      return find(root.left, key);
    }
    return find(root.right, key);
  }
}
// @lc code=end
