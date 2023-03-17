class Solution {
    public int maxSubArray(int[] nums) {

        /* Solution 
        O(n) Approach - Kadane's Algorithm
        */
        int largest =Integer.MIN_VALUE;
        int sum=0;
        for(int el : nums)
        {
            sum += el;
            if(sum > largest) largest=sum;
            if(sum < 0) sum=0;
        }
        return largest;
    
    }
}
