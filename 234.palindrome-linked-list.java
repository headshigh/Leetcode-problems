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
    ListNode head2 = reverse(mid);
    System.out.println(head2.val);
    ListNode reverseHead = head2; //we have to reserve it because we need to reverse the list again
    while (head != null && head2 != null) {
      if (head.val != head2.val) {
        break;
      }
      head = head.next;
      head2 = head2.next;
    }
    reverse(reverseHead);
    return head == null || head2 == null;
  }

  public ListNode findmin(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null&& fast.next!=null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  public ListNode reverse(ListNode head) {
    ListNode newHead = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }
    return newHead;
}
// @lc code=end
