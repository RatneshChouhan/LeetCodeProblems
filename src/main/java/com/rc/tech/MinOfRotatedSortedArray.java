package com.rc.tech;

public class MinOfRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println("Min of Array nums = [4,5,6,7,0,1,2] is:" + findMin(nums));
    }

    public static int findMin(int[] nums) {
        int len = nums.length;
        if (nums == null || nums.length == 0)
            return -1;
        if (len == 1)
            return nums[0];
        int start = 0, end = len - 1;
        while (start < end) {
            int mid = (start + end) / 2;

            if (mid > 0 && nums[mid] < nums[mid - 1])
                return nums[mid];

            if (nums[start] <= nums[mid] && nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return nums[start];
    }
}
