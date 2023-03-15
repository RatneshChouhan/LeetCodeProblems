package com.rc.tech;

import java.util.*;

public class FindFirstNonRepeatingCharInString {

    public static void main(String[] args) {
        String input = "abcdefghija";

    //  Method - 1: Using Set & List;
        List<Character> nonRepeating = new ArrayList<>();
        Set<Character> repeating = new HashSet<>();
        for(Character ch : input.toCharArray()) {
            if(!repeating.contains(ch)) {
                if(nonRepeating.contains(ch)) {
                    nonRepeating.remove(ch);
                    repeating.add(ch);
                } else {
                    nonRepeating.add(ch);
                }
            }
        }
        System.out.println("First Non-Repeating Character in String [abcdefghija] is:-");
        System.out.println("Method-1 [Using Set and List]: " + nonRepeating.get(0));

        // Method - 2: Using LinkedHashMap

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for(Character ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : charCount.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println("Method-2 [Using LinkedHashMap]: " + entry.getKey());
                break;
            }
        }

        // Method - 3: Using HashMap

        Map<Character,Integer> charFrequencies = new HashMap<>();

        for(Character ch : input.toCharArray()) {
            charFrequencies.put(ch,charFrequencies.getOrDefault(ch,0) + 1);
        }

        for (Character ch : input.toCharArray()) {
            if(charFrequencies.get(ch) == 1) {
                System.out.println("Method-3 [Using HashMap]: " + ch);
                break;
            }
        }


    }
}
