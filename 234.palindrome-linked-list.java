/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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

  public boolean isPalindrome(ListNode head) {
    ListNode mid = findmin(head);
    return true;
  }

  public ListNode findmin(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }
}
// @lc code=end
