import java.util.ArrayList;

/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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

  public boolean hasCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) {
        //find the length of the cycle
        /*length=0
         * do{
         * slow=slow.next;
         * length++
         * }while(slow!=fast)
         * retun length
         */
        return true;
      }
    }
    return false;
    // ArrayList<ListNode> list = new ArrayList<>();
    // ListNode hed = head;
    // ListNode pointer = head;
    // boolean cycle = false;
    // if (pointer == null) {
    //   return false;
    // }
    // while (!cycle) {
    //   if (list.contains(pointer)) {
    //     cycle = true;
    //   }
    //   if (pointer.next == null) {
    //     return false;
    //   }
    //   list.add(pointer);
    //   pointer = pointer.next;
    // }
    // return cycle;
  }
}
// @lc code=end
