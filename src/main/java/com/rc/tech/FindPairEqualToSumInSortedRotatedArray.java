package com.rc.tech;

public class FindPairEqualToSumInSortedRotatedArray {

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 16;
        int N = arr.length;

        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    }

    public static boolean pairInSortedRotated(int [] arr, int N, int X) {
        int mxIdx = 0;
        int mnIdx = N - 1;
        for(int i = 0; i < N; i++) {
            if(arr[i] > arr[mnIdx])
                mxIdx = i;
            if(arr[i] < arr[mnIdx])
                mnIdx = i;
        }

        while(mxIdx != mnIdx) {
            int sum = arr[mnIdx] + arr[mxIdx];
            if( sum == X)
                return true;
            else if(sum < X)
                mnIdx = (mnIdx + 1) % N;
            else
                mxIdx = (mxIdx - 1 + N) % N;
        }
        return false;
    }

}
