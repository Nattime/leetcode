package Q_2000_2999;

import java.util.Arrays;

/**
 * 2966. Divide Array Into Arrays With Max Difference
 */
public class DivideArrayIntoArraysWithMaxDifference{
    public int[][] divideArray(int[] nums, int k){
        int len = nums.length;
        int[][] arr = new int[len / 3][];
        Arrays.sort(nums);
        for(int i = 2; i < len; i += 3){
            if(nums[i] - nums[i - 2] > k){
                return new int[0][];
            }
            arr[i / 3] = new int[]{nums[i - 2], nums[i - 1], nums[i]};
        }
        return arr;
    }
}
