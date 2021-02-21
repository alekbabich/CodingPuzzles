package com.babich.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {12,13,17,14,8};
        int target = 29;
        int[] result = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i =0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (visitedNumbers.containsKey(delta)) {
                return new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] { -1, -1};
    }

}
