
package com.rc.tech;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] height = new int[] {4,2,0,3,2,5};

        int totalTrappedWater = getTrappedWater(height);
        System.out.println("Total Water Trapped Water - " + totalTrappedWater);
    }

    public static int getTrappedWater(int[] heightArr) {
        int len = heightArr.length;
        if(len < 2) {
            return 0;
        }

        int leftMx = heightArr[0], rightMx = heightArr[len - 1];
        int left = 1 , right = len - 2;
        int trappedWater = 0;
        while(left < right) {
            if(heightArr[left] <= heightArr[right]) {
                leftMx = Math.max(heightArr[left], leftMx);
                trappedWater += leftMx - heightArr[left];
                left++;
            } else {
                rightMx = Math.max(heightArr[right], rightMx);
                trappedWater += rightMx - heightArr[right];
                right--;
            }
        }
        return trappedWater;
    }
}