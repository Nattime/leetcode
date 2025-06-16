package Q_2000_2999;

/**
 * 2016. Maximum Difference Between Increasing Elements
 */
public class MaximumDifferenceBetweenIncreasingElements{
    public int maximumDifference(int[] nums){
        int minVal = nums[0];
        int max = -1;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] > minVal){
                max = Math.max(max, nums[i] - minVal);
            }else{
                minVal = nums[i];
            }
        }
        return max;
    }
}
