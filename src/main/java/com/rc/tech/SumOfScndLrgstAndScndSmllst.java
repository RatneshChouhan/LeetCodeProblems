package com.rc.tech;

  /*  Accenture OA Question
    Given an array find the sum of second largest number from even location
    and second smallest number from odd location.
    index 0 is considered even.
  */


public class SumOfScndLrgstAndScndSmllst {

    public static void main(String[] args) {
        int [] nums = {3,5,1,4,7,6,9,11,12};
        int lrgst = Integer.MIN_VALUE;
        int scndLrgst = Integer.MIN_VALUE;
        int smllst = Integer.MAX_VALUE;
        int scndSmllst = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (nums[i] > lrgst) {
                    scndLrgst = lrgst;
                    lrgst = nums[i];
                }
               /* if (lrgst > nums[i] && nums[i] > scndLrgst)
                     scndLrgst = nums[i];*/
            } else {
                if (nums[i] < smllst) {
                    scndSmllst = smllst;
                    smllst = nums[i];
                }
               /* if (nums[i] > smllst && nums[i] < scndSmllst)
                    scndSmllst = nums[i];*/
            }
        }
        System.out.println("The Second Largest No: " + scndLrgst + " Second Smallest No: " + scndSmllst +
                " And their Sum: " + (scndSmllst+scndLrgst));
    }

}
