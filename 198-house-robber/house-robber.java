class Solution {
    public int func(int[] nums , int ind , int[] dp){
        if(ind >= nums.length){
            return 0;
        }

        if(dp[ind] != -1)return dp[ind];

        int pick = nums[ind] + func(nums , ind + 2  ,dp);
        int notpick = func(nums , ind + 1  , dp);

        return dp[ind] = Math.max(pick , notpick);

    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return func(nums ,  0 , dp);
        
    }
}