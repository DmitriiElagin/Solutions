package com.dmitrii.elagin;

public class Solutions {

    //Находит индексы 2-х элементов массива, суммой которых является target
    public static int[] twoSum(int [] numbers, int target) {

    for(int i=0; i<numbers.length; i++) {
        for(int j=i+1; j<numbers.length; j++) {
            if(numbers[i]+numbers[j]==target) {
                return  new int[]{i,j};
            }
        }
    }

    return null;
}
}
