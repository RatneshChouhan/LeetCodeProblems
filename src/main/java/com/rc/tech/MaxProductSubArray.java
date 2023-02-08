package com.rc.tech;
/*  Edge Cases -
    1: All element in array are +ve
    2: All element in array are -ve ** -> This is the reason to keep Min value calc as well.
    3: No of -ve element in an Array are EVEN.
    4. No of -ve element in an Array are ODD.
 */
public class MaxProductSubArray {
    public static void main(String[] args) {
        int [] nums = new int [] {2,3,-2,4};
        System.out.println("Max Product Of Sub-Array is: " + maxProduct(nums));

    }

    private static int maxProduct(int[] nums) {
        int len = nums.length;
        int mxProd = nums[0];
        int mx = nums[0];
        int mn = nums[0];
        for(int i = 1; i < len; i++) {
            if(nums[i] < 0) {
                int temp = mx;
                mx = mn;
                mn = temp;
            }
            mx = Math.max(nums[i], mx * nums[i]);
            mn = Math.min(nums[i], mn * nums[i]);

            mxProd = Math.max(mx , mxProd);
        }

        return mxProd;
    }
}
