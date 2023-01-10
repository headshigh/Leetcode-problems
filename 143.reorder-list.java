/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
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

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }

    ListNode mid = findmin(head);

    ListNode hs = reverse(mid);
    ListNode hf = head;

    // rearrange
    while (hf != null && hs != null) {
      ListNode temp = hf.next;
      hf.next = hs;
      hf = temp;

      temp = hs.next;
      hs.next = hf;
      hs = temp;
    }

    // next of tail to null
    if (hf != null) {
      hf.next = null;
    }
  }

  public ListNode findmin(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  public ListNode reverse(ListNode head) {
    ListNode newHead = null;
    while (head != null) {
      // System.out.println(head.val);
      ListNode next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }
    return newHead;
  }
}
// @lc code=end
