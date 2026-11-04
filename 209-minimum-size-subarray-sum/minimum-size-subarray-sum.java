class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;

        int low = 0 , high = 0 ;
        int mini = Integer.MAX_VALUE;

        while(high < n){
            sum += nums[high];
            while(low <= high && sum >= target){
                mini = Math.min(mini , high - low + 1);
                sum -= nums[low];                
                low++;
            }
            high++;


        }
        if(mini == Integer.MAX_VALUE){
            return 0;
        }
        return mini;
        
    }
}