class Solution {
    public boolean func(int[] nums , int k , int ind , int[][] dp){
        if(k == 0){
            return true;
        }
        if(ind == nums.length){
            return false;
        }

        if(dp[ind][k] != -1){
            return dp[ind][k] == 1;
        }

        boolean pick = false;
        if(nums[ind] <= k){
            pick = func(nums , k - nums[ind] , ind+1 , dp);
        }
        boolean notpick = func(nums , k , ind+1 , dp);

        if(pick || notpick){
            dp[ind][k] = 1;
            return true;
        }
        else{
            dp[ind][k] = 0;
            return false;
        }
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
        }

        if(sum %2 != 0){
            return false;
        }
        int k = sum / 2;

        int[][] dp = new int[n][k+1];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }

        return func(nums , k , 0 , dp);
        
    }
}