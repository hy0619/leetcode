package com.hy.algorithm;

/**
 * @author Hero
 * @version 1.0.0
 * @description TODO
 * @date 2021-6-11 23:42
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] indexArray = twoSum(new int[]{1, 3, 7, 43, 2}, 11);
        if(indexArray != null){
            for(int i = 0 ; i< indexArray.length ; i++){
                System.out.println(indexArray[i]);
            }

        }
    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 0) {return new int[0];}
        for(int i = 0 ; i < nums.length ; i++){
            for(int k = i+1 ; k < nums.length ; k++){
                if(nums[i] + nums[k] == target){
                    return new int[]{i, k};
                }else{
                    continue;
                }
            }
        }
        return new int[0];
    }
}
