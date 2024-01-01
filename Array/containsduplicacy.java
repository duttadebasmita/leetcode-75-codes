package Array;

import java.util.HashSet;
import java.util.Set;

class Solution {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int x : nums) {
      if (!set.add(x)) return true;
    }
    return false; // Return false if no duplicates found
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] nums1 = { 1, 2, 3, 4, 5 };
    System.out.println(
      "Contains Duplicate in nums1? " + solution.containsDuplicate(nums1)
    );

    int[] nums2 = { 1, 2, 3, 4, 1 };
    System.out.println(
      "Contains Duplicate in nums2? " + solution.containsDuplicate(nums2)
    );

    int[] nums3 = { 1, 1, 2, 2, 3, 3, 4, 4 };
    System.out.println(
      "Contains Duplicate in nums3? " + solution.containsDuplicate(nums3)
    );
  }
}
