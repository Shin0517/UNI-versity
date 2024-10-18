package W7_1017;
import java.util.*;

public class exe1017 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println("Test Case 1:");
        solution.findDifference(nums1, nums2);

        // Test case 2
        int[] nums1_2 = {1, 1, 3, 3};
        int[] nums2_2 = {1, 1, 2, 2};
        System.out.println("Test Case 2:");
        solution.findDifference(nums1_2, nums2_2);

        // Test case 3
        int[] nums1_3 = {4, 5, 6};
        int[] nums2_3 = {4, 4, 5};
        System.out.println("Test Case 3:");
        solution.findDifference(nums1_3, nums2_3);
    }
}

class Solution {
    public void findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        System.out.println("Elements in nums1 but not in nums2: " + diff1);
        System.out.println("Elements in nums2 but not in nums1: " + diff2);
    }
}
