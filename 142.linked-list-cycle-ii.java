/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

  public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    int i = hasCycle(head);
    System.out.println(i);

    while (i > 0) {
      fast = fast.next;
      i--;
    }
    if (hasCycle(head) != -1) {
      while (slow != fast) {
        fast = fast.next;
        slow = slow.next;
      }
      return slow;
    }
    return null;
  }

  public static int hasCycle(ListNode head) {
    ListNode f = head;
    ListNode s = head;
    int length = 0;
    while (f != null && f.next != null) {
      f = f.next.next;
      s = s.next;
      if (s == f) {
        do {
          s = s.next;
          length++;
        } while (s != f);
      }
    }
    return length;
  }
}
//length jailei pani 0 return vai rach teshlai fix gar
// @lc code=end
