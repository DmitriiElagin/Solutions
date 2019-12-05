package com.dmitrii.elagin;

public class PhoneNumber {

    public static String createPhoneNumber(int[] nums) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0],nums[1],nums[2],nums[3],nums[4],
                nums[5],nums[6],nums[7],nums[8],nums[9]);
    }
}
