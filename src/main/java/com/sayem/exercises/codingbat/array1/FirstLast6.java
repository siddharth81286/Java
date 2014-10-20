package com.sayem.exercises.codingbat.array1;

public class FirstLast6 {

    public static void main(String[] args) {

        System.out.println(firstLast6(new int[]{1, 2, 6}));
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
    public static boolean firstLast6(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (i == nums[nums.length - 1] && i >= 1){
                return false;
            }
        }
        return true;
    }
}
