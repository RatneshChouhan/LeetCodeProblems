package com.rc.tech;

import java.util.Arrays;
import java.util.Optional;

public class ThirdHighest {

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Optional<Integer> optionalInt = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b.compareTo(a))
                .skip(2)
                .findFirst();
        if(optionalInt.isPresent())
            System.out.println(optionalInt);
    }
}
