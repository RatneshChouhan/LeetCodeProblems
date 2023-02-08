package com.rc.tech;

public class Solution {

    public static void main(String[] args) {
        int [] nums = new int [] {6,1,5,3,2};

        System.out.println("Next permutation is: " + nxtPermutation(nums));
    }

    // 6 1 5 3 2


    private static String nxtPermutation(int[] nums) {
        int i = nums.length - 2;

        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if(i >= 0) {
            int j = nums.length - 1;
            while(nums[i] >= nums[j])
                j--;
            if(j >= 0)
                swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);
        StringBuilder sb = new StringBuilder();
        for(int e : nums)
            sb.append(e);
        return sb.toString();
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static void reverse(int[] nums, int s, int e) {
        while(s < e) {
            swap(nums, s, e);
            s++;
            e--;
        }
    }
}
