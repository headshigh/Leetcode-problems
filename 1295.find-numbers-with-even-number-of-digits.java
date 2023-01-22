/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {

  public int findNumbers(int[] nums) {
    return find(nums);
  }

  static int find(int[] arr) {
    int count = 0;
    for (int num : arr) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  static boolean even(int num) {
    int numberofdigits = digits(num);
    return numberofdigits % 2 == 0;
  }

  static int digits(int number) {
    int count = 0;
    if (number < 0) {
      number = number * -1;
    }
    if (number == 0) {
      return 1;
    }
    while (number > 0) {
      count++;
      number = number / 10;
    }
    return count;
  }
}
// @lc code=end
