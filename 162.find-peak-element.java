/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

// @lc code=start
class Solution {

  public static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid + 1] > arr[mid]) { //ascending order mai cha vanesi mountain ko peak esko pachidi tira cha hai
        start = mid;
      }
      //can't do mid-1 because it can get out of range but can do mid+1 as last element cannot be mid
      else if (arr[mid - 1] > arr[mid] && arr[mid + 1] < arr[mid]) {
        end = mid;
      }
      if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
        return mid;
      }
    }
    return -1;
  }
}
// @lc code=end
