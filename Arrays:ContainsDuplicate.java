import java.util.Arrays;
import java.util.Collections;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean test = false;
        HashSet<Integer> hs = new HashSet<Integer> ();
        for(int el : nums)
        {
            if(!hs.contains(el))
                hs.add(el);
            else
                {
                    test=true;
                    break;
                }
        }
        
        
        return test;
        
    }
}
