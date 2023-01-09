/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
class Solution {

  public ListNode middleNode(ListNode head) {
    int i = count(head) / 2;

    if (count(head) % 2 == 0) {
      i = (count(head) / 2) + 1;
    }
    ListNode temp = head;
    while (i > 0) {
      temp = temp.next;
      i--;
    }
    return temp;
  }

  public int count(ListNode head) {
    ListNode pointer = head;
    int count = 0;
    while (pointer.next != null) {
      count++;
      pointer = pointer.next;
    }
    return count;
  }
}
// @lc code=end
