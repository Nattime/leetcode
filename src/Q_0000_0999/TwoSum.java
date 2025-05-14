package Q_0000_0999;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 */

public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        int[] ret = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                ret[0] = map.get(val);
                ret[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }
        return ret;
    }
}
