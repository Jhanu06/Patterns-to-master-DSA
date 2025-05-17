
import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  
            if (map.containsKey(sum)) {
                int oldIndex = map.get(sum);  
                int len = i - oldIndex;
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}