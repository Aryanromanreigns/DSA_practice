class Solution {
    public int func(int[] nums , int ind , int end, int[] dp){
        if(ind > end){
            return 0;
        }

        if(dp[ind] != -1)return dp[ind];

        int pick = nums[ind] + func(nums , ind + 2 , end ,dp);
        int notpick = func(nums , ind + 1 , end , dp);

        return dp[ind] = Math.max(pick , notpick);

    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];
        
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        int one = func(nums ,  0 , n-2, dp);


        int[] dptwo = new int[n];
        Arrays.fill(dptwo , -1);
        int two = func(nums ,  1, n-1, dptwo);

        return Math.max(one , two);
        
    }
}