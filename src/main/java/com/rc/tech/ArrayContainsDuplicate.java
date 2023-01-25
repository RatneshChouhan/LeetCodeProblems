package com.rc.tech;

import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicate {

    public static void main(String[] args) {
        int [] nums = new int[] {1,2,3,4};//{1,1,1,3,3,4,3,2,4,2};

        System.out.println("Input Array Contains Duplicate: " + containsDuplicate(nums));
        
    } 

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n : nums) numSet.add(n);
        return numSet.size() == nums.length;
    }


}
