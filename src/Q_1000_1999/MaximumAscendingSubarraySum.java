package Q_1000_1999;

/**
 * 1800. Maximum Ascending Subarray Sum
 */
public class MaximumAscendingSubarraySum{
    public int maxAscendingSum(int[] nums){
        int max = nums[0];
        int sum = nums[0];
        int len = nums.length;
        for(int j = 1; j < len; j++){
            if(nums[j] > nums[j - 1]){
                sum += nums[j];
            }else{
                sum = nums[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
