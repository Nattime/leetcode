package Q_3000_3999;

import java.util.Arrays;

/**
 * 3397. Maximum Number of Distinct Elements After Operations
 */

public class MaximumNumberOfDistinctElementsAfterOperations{
    public int maxDistinctElements(int[] nums, int k){
        int ret = 0;
        int prev = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int iter : nums){
            if(prev < iter + k){
                prev = Math.max(prev + 1, iter - k);
                ret++;
            }
        }
        return ret;
    }
}