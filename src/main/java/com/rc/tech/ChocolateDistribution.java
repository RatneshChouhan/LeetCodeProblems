package com.rc.tech;

import java.util.*;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int [] nums = new int[] {12, 4, 7, 9, 2, 23, 25, 41, 30,40, 28, 42, 30, 44, 48, 43, 50};
        System.out.println("The Min different is: " + findMinDiff(nums, 7));

        List<Integer> iList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> iset = new HashSet<>(iList);

        iList.addAll(iset);
        iset.addAll(iList);
    }

    public static int findMinDiff(int [] nums, int m) {
        int len = nums.length;
        Arrays.sort(nums);

        if(len < m) return -1;
        int min_diff = Integer.MAX_VALUE;

        for(int i = 0; i + m - 1 < len; i++) {
            int diff = nums[i + m - 1] - nums[i];
            min_diff = Math.min(diff, min_diff);
        }

        return min_diff;
    }

}
