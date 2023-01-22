/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {

  public int[] searchRange(int[] nums, int target) {
    int[] ans = { -1, -1 };
    ans[0] = search(nums, target, true);
    if (ans[0] != -1) {
      ans[1] = search(nums, target, false);
    }
    return ans;
  }

  static int search(int[] arr, int target, boolean isfirstindex) {
    int start = 0;
    int end = arr.length - 1;
    int ans = -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > target) {
        end = mid - 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        ans = mid;
        if (isfirstindex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }
}
// @lc code=end
