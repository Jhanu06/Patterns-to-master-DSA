
import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
       int ps=0;
       int count=0;
       Map<Integer,Integer> hm=new HashMap<>();
       hm.put(0,1);
       for(int i:nums)
       {
        ps+=i;
        if(hm.containsKey(ps-k))
        {
            count=count+hm.get(ps-k);
        }
        hm.put(ps,hm.getOrDefault(ps,0)+1);
       }

return count;
    }
}