package Q_3000_3999;

/**
 * 3423. Maximum Difference Between Adjacent Elements in a Circular Array
 */
public class MaximumDifferenceBetweenAdjacentElementsInACircularArray{
    public int maxAdjacentDistance(int[] nums){
        int dis = Math.abs(nums[0] - nums[nums.length - 1]);
        for(int i = 0; i < nums.length - 1; i++){
            dis = Math.max(dis, Math.abs(nums[i] - nums[i + 1]));
        }
        return dis;
    }
}