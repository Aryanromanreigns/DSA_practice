class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        int mini = Integer.MAX_VALUE;
        int sum = 0;

        int high = 0 , low = 0;

        while(high < n){
            sum += nums[high];

            while(low <= high && sum >= target){
                mini = Math.min(mini , high - low + 1);
                sum -= nums[low];
                low++;
            }


            high++;
        }
        return mini == Integer.MAX_VALUE ? 0 : mini;
        
    }
}