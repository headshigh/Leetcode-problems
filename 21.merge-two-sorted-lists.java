/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyhead = new ListNode(); //dummy head
    ListNode list3 = dummyhead; //value keeps changing
    ListNode list1pointer = list1;
    ListNode list2pointer = list2;

    while (list1pointer != null && list2pointer != null) {
      if (list1pointer.val > list2pointer.val) {
        list3.next = (list1pointer);
        list1pointer = list1pointer.next;
      }
      if (list1pointer.val < list2pointer.val) {
        list3.next = (list2pointer);
        list2pointer = list2pointer.next;
      }
    }
    while (list1pointer != null) {
      list3.next = (list1pointer);
      list1pointer = list1pointer.next;
    }
    while (list2pointer != null) {
      list3.next = (list2pointer);
      list2pointer = list2pointer.next;
    }
    return dummyhead;
  }
}
// @lc code=end
