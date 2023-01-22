/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {

  public int searchInsert(int[] nums, int target) {
    return search(nums, target);
  }

  static int search(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      midToreturn = mid;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
        midToreturn = start;
      } else {
        return mid;
      }
    }
    return start;
  }
}
// @lc code=end
