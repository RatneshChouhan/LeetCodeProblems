package com.rc.tech;

public class FindMinOpsToMakeArrayPallindrome {
    public static void main(String[] args) {
        int [] arr = new int[] {11, 14, 15, 99};          //{1, 4, 5, 9, 1};
        System.out.println("Count of minimum operations is " + findMinOps(arr, arr.length));
    }

    private static int findMinOps(int[] arr, int length) {
        int ops = 0;
        for(int i = 0, j = length - 1; i <= j;) {
            if(arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] < arr[j]) {
                i++;
                arr[i] += arr[i - 1];
                ops++;
            } else {
                j--;
                arr[j] += arr[j + 1];
                ops++;
            }
        }
        return ops;
    }
}
