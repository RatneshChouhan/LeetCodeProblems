package com.rc.tech;

public class ContinuousSequenceFinder {
    public static void main(String[] args) {
        String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -3 -2 -1";

        String[] inputArr = input.split("\\s+");
        boolean inSequence = false;
        int start = 0;

        for (int i = 0; i < inputArr.length; i++) {
            try {
                int currentNum = Integer.parseInt(inputArr[i]);
                if (inSequence) {
                    int nextNum = Integer.parseInt(inputArr[i + 1]);
                    if (currentNum + 1 == nextNum) {
                        continue;
                    } else {
                        System.out.println("Sequence found: " + start + " to " + inputArr[i]);
                        inSequence = false;
                    }
                } else {
                    int nextNum = Integer.parseInt(inputArr[i + 1]);
                    if (currentNum + 1 == nextNum) {
                        start = currentNum;
                        inSequence = true;
                    }
                }
            } catch (NumberFormatException e) {
                if (inSequence) {
                    System.out.println("Sequence found: " + start + " to " + inputArr[i - 1]);
                    inSequence = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (inSequence) {
                    System.out.println("Sequence found: " + start + " to " + inputArr[i]);
                }
            }
        }
    }
}