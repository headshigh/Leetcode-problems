/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start

      int mid = start + (end - start) / 2;
      // 4 cases over here
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      if (arr[mid] <= arr[start]) {
        end = mid - 1;
      }
      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        //cheack if start is pivot;
        if (arr[start] > arr[start + 1]) {
          return start;
        }
        start++;
        if (arr[end] > arr[end - 1]) {
          return end - 1;
        }
        end--;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}
// @lc code=end
