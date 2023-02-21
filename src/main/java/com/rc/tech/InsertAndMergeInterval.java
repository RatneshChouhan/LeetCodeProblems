package com.rc.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAndMergeInterval {

    public static void main(String[] args) {
        int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newInterval = {4,8};
        InsertAndMergeInterval(intervals, newInterval);
    }

    private static void InsertAndMergeInterval(int[][] intervals, int[] newInterval) {
        int i = 0;
        int n = intervals.length;
        List<int[]> merged = new ArrayList<>();

        // Add all the interval which comes before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }

        // Merge overlapping interval with newInterval and add newInterval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
            i++;
        }

        merged.add(newInterval);

        // Add all the remaining intervals which comes after newInterval
        while (i < n) {
            merged.add(intervals[i]);
            i++;
        }

        merged.stream().forEach(row -> System.out.println(Arrays.toString(row)));
    }
}
