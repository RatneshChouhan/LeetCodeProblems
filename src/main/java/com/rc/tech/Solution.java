
package com.rc.tech;

import java.math.BigDecimal;
import java.util.Arrays;

class Ex0 extends Exception { }
class Ex1 extends Ex0 { }

@FunctionalInterface
interface NumberComparator {
    boolean compareNumber(int x, int y);
}


public class Solution {
    public static void main(String[] args) {

        double a = 0.02, b = 0.03;
        double c = b - a;
        System.out.println(c);

        BigDecimal _a = new BigDecimal("0.02");
        BigDecimal _b = new BigDecimal("0.03");
        BigDecimal _c = _b.subtract(_a);

        System.out.println(_c);

        int [] arr = new int[5];

        for(int i = 5; i > 0; i--)
            arr[5 - i] = i;
        Arrays.fill(arr, 1, 4, 8);

        for(int el : arr)
            System.out.println(el);

        NumberComparator c1 = (a1 , b1) -> {
            if(a1 > b1)
                return true;
            return false;
        };

        System.out.println(c1.compareNumber(5, 3));

        /* try {
            throw new Ex1();
        } catch (Ex0 e0) {
            System.out.println("Ex0 Caught");
        } catch (Exception e) {
            System.out.println("Exception Caught");
        }*/

    }
}

/*
// Java program to find minimum element in a sorted and
// rotated array

import java.io.IOException;

class Solution {
    static int findMin(int arr[], int low, int high)
    {
        // This condition is needed to handle the case when
        // array is not rotated at all
        if (high < low)
            return arr[0];

        // If there is only one element left
        if (high == low)
            return arr[low];

        // Find mid
        int mid = low + (high - low) / 2; */
/*(low + high)/2;*//*


        // Check if element (mid+1) is minimum element.
        // Consider the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid + 1] < arr[mid])
            return arr[mid + 1];

        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];

        // Decide whether we need to go to left half or
        // right half
        if (arr[high] > arr[mid])
            return findMin(arr, low, mid - 1);
        return findMin(arr, mid + 1, high);
    }

    // Driver Program
    public static void main(String[] args)
    {
        */
/*int arr[] = { 3, 4, 5, 6, 1, 2 };
        int N = arr.length;
        System.out.println("The minimum element is "
                + findMin(arr, 0, N - 1));*//*


*/
/*        String s1 = new String("Rats");
        String s2 = "Rats";
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());*//*


        boolean b = false;

        if(b = true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

class AirPlane {
    public AirPlane() throws IOException {
        System.out.println("AirPlain");
        throw new IOException();
    }
}

class AirJet extends AirPlane {
    public AirJet() throws IOException {
        System.out.println("AirJet");
        try {
            super();
    }
}
*/
