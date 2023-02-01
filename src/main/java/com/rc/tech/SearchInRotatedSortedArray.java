package com.rc.tech;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        /*int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println("Value " + 0 + " Found at the index: " + search(nums, 0, nums.length - 1, 0));*/

        int [] nums1 = new int [] {5, 1, 3};
        System.out.println(search(nums1, 0, 2, 5));

    }

    public static int search(int[] nums, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;

        if (nums[mid] == key)
            return mid;

        if (nums[low] <= nums[mid]) {
            if (nums[low] <= key && key <= nums[mid]) {
                return search(nums, low, mid - 1, key);
            } else {
                return search(nums, mid + 1, high, key);
            }
        }
        if(nums[mid] <= key && key <= nums[high])
            return search(nums, mid + 1, high, key);

        return search(nums, low, mid - 1, key);
    }
}
