/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
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

  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode mid = getMid(head);
    // System.out.println(mid.val);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);
    return merge(left, right);
  }

  public ListNode merge(ListNode node1, ListNode node2) {
    ListNode pointer1 = node1;
    ListNode pointer2 = node2;
    ListNode dummyhead = new ListNode(); //to return
    ListNode tail = dummyhead; //pointer for new linked list
    while (pointer1 != null && pointer2 != null) {
      if (pointer1.val < pointer2.val) {
        if (tail == null) {
          tail = pointer1;
        } else {
          tail.next = pointer1;
          tail = pointer1;
        }
        pointer1 = pointer1.next;
      }
      if (pointer2.val < pointer1.val) {
        if (tail == null) {
          tail = pointer2;
        } else {
          tail.next = pointer2;
          tail = pointer2;
        }
        pointer2 = pointer2.next;
      }
    }
    while (pointer1 != null) {
      if (tail == null) {
        tail = pointer2;
      } else {
        tail.next = pointer2;
        tail = pointer2;
      }
      pointer2 = pointer2.next;
    }
    while (pointer2 != null) {
      if (tail == null) {
        tail = pointer2;
      } else {
        tail.next = pointer2;
        tail = pointer2;
      }
      pointer2 = pointer2.next;
    }
    return dummyhead;
  }

  public ListNode getMid(ListNode head) {
    ListNode first = head;
    ListNode second = null;
    while (first != null && first.next != null) {
      first = first.next.next;
      second = (second == null) ? head : second.next;
    }
    ListNode midPrev = second;
    ListNode mid = midPrev.next;
    midPrev.next = null;
    return mid;
  }
}
// class Solution {
//   public ListNode sortList(ListNode head) {
//     for (int i = 0; i < count(head) - 1; i++) {
//       for (int j = i + 1; j < count(head); j++) {
//         if (getIndex(head, i).val > getIndex(head, j).val) {
//           swap(getIndex(head, i), getIndex(head, j));
//         }
//       }
//     }
//     return head;
//   }
//   public void swap(ListNode node1, ListNode node2) {
//     int temp = node1.val;
//     node1.val = node2.val;
//     node2.val = temp;
//   }
//   public ListNode getIndex(ListNode head, int index) {
//     ListNode pointer = head;
//     int i = index;
//     while (i > 0 && pointer.next != null) {
//       pointer = pointer.next;
//       i--;
//     }
//     return pointer;
//   }
//   public ListNode previousNode(ListNode head, ListNode node) {
//     ListNode pointer = head;
//     for (int i = 0; i < count(head); i++) {
//       if (pointer.next == node) {
//         return pointer;
//       }
//       pointer = pointer.next;
//     }
//     return null;
//   }
//   public int count(ListNode head) {
//     int count = 1;
//     while (head != null) {
//       count++;
//       head = head.next;
//     }
//     return count;
//   }
// }
// @lc code=end
