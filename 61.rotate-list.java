/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//you connect last node to first and simply cut link form where you have to and if the length of list is equal to number of rotations we get the same list
class Solution {

  public ListNode rotateRight(ListNode head, int k) {
    if (k <= 0 || head == null || head.next == null) {
      return head;
    }
    ListNode last = head;
    int length = 1;
    while (last.next != null) {
      last = last.next;
      length++;
    }
    last.next = head;
    int rotations = k % length;
    int skip = length - rotations;
    ListNode newLast = head;
    for (int i = 0; i < skip - 1; i++) {
      newLast = newLast.next;
    }
    head = newLast.next;
    newLast.next = null;
    return head;
  }
}
// @lc code=end
