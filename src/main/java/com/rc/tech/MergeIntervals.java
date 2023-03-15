package com.rc.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
    //    int[][] intervals =  {{6,8},{1,9},{2,4},{4,7}};
        int[][] intervals =  {{8,10},{1,3},{2,6},{15,18}};

        Comparator<int[]> rowComparator = Comparator.comparingInt(row -> row[0]);
        Arrays.sort(intervals, rowComparator);
        /*
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        Arrays.stream(intervals).forEach(row -> System.out.println(Arrays.toString(row)));
        Arrays.stream(intervals).forEach(row -> {Arrays.stream(row).forEach(el -> System.out.print(el));});
        */

        List<int[]> mergedInt = new ArrayList<>();
        int[] previous = intervals[0];

        for(int i = 1; i < intervals.length; i++) {
            int [] current = intervals[i];

            if (current[0] <= previous[1]) {
                previous[1] = Math.max(previous[1] , current[1]);
            } else {
                mergedInt.add(previous);
                previous = current;
            }
        }
        mergedInt.add(previous);
        mergedInt.stream().forEach(row -> System.out.println(Arrays.toString(row)));
    }
}
