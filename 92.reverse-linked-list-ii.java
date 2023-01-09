/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
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

  public ListNode reverseBetween(ListNode head, int left, int right) {
    System.out.println(getNodebyindex(head, 0));
    if (left == right && right == 1) {
      return head;
    }
    if (getNodebyindex(head, left - 1) == null) {
      head.next =
        reverseWithin(
          head,
          getNodebyindex(head, left),
          getNodebyindex(head, right),
          getNodebyindex(head, right + 1)
        );
    }
    getNodebyindex(head, left - 1).next =
      reverseWithin(
        head,
        getNodebyindex(head, left),
        getNodebyindex(head, right),
        getNodebyindex(head, right + 1)
      );
    return head;
  }

  public ListNode reverseWithin(
    ListNode originalhead,
    ListNode left,
    ListNode right,
    ListNode after
  ) {
    ListNode NewHead = after;
    ListNode head = left;
    if (left == right) {
      return head;
    }
    while (head != after) {
      ListNode next = head.next;
      head.next = NewHead;
      NewHead = head;
      head = next;
    }
    return NewHead;
  }

  public static ListNode getNodebyindex(ListNode head, int index) {
    int i = index;
    ListNode headpointer = head;
    if (i < 1) {
      return null;
    }
    while (i > 1) {
      headpointer = headpointer.next;
      i--;
    }
    return headpointer;
  }
}
// @lc code=end
