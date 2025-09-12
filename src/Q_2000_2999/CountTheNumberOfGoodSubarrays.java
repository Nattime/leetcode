package Q_2000_2999;

import java.util.HashMap;
import java.util.Map;

/**
 * 2537. Count The Number Of Good Subarrays
 */
public class CountTheNumberOfGoodSubarrays{
    public long countGood(int[] nums, int k){
        int i = 0, j = 0;
        int pairsCount = 0;
        long ret = 0;

        Map<Integer, Integer> m = new HashMap<>();
        for(; j < nums.length; j++){
            int num = nums[j];
            if(m.containsKey(num)){
                int count = m.get(num);
                pairsCount += count;
                m.put(num, count + 1);
            }else{
                m.put(num, 1);
            }

            while(pairsCount >= k){
                int val = nums[i++];
                int count = m.get(val);
                if(count == 1){
                    m.remove(val);
                }else{
                    pairsCount -= count - 1;
                    m.put(val, count - 1);
                }
            }
            ret += i;
        }

        return ret;
    }
}
