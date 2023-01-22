package com.rc.tech;

public class NextPermutationOfANumber {

    public static void main(String[] args) {
        /*int [] nums = new int[] {1,6,5,4,2};//{3,2,1};
        int[] newNums = nextPermutation(nums);
        for(int e : newNums)
            System.out.print(e + " ");*/

        int [] height = new int[] {4,2,0,3,2,5};

   //     int totalTrappedWater = getTrappedWater(height);
   //     System.out.println("Total Water Trapped Water - " + totalTrappedWater);
    }

 /*   public static int getTrappedWater(int[] heightArr) {
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
    }*/

    //numArrayIdx :- 0 1 2 3 4
    //numArrayEle :- 1 6 5 4 2

    public static int[] nextPermutation(int[] numArray) {
        int len = numArray.length;
        if(len < 2) return numArray;

        int r = len - 2;

        while(r >= 0 && numArray[r] >= numArray[r + 1]) r--;
        if(r >= 0) {
            int rr = len - 1;
            while(rr >= 0 && numArray[r] >= numArray[rr]) rr--;
            swap(numArray, r, rr);
        }
        reverseArr(numArray, r + 1, len - 1);

        return numArray;
    }

    private static void reverseArr(int[] numArr, int s, int e){
        while(s < e) {
            swap(numArr, s, e);
            s++;
            e--;
        }
    }

    private static void swap(int[] numArr, int s, int e) {
        int t = numArr[s];
        numArr[s] = numArr[e];
        numArr[e] = t;
    }
}
