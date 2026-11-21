class Solution {
    public int func(int ind , int[] coins , int amount , int[][] dp){
        if(amount == 0){
            return 1;
        }
        if(ind == coins.length){
            return 0;
        }
        if(dp[ind][amount] != -1){
            return dp[ind][amount];
        }
        int pick = 0;
        if(coins[ind] <= amount){
            pick = func(ind , coins , amount-coins[ind] , dp);
        }
        int notpick = func(ind + 1, coins , amount ,dp);

        return dp[ind][amount] = pick + notpick;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];

        for(int[] row : dp){
            Arrays.fill(row , -1);
        }

        return func(0 , coins , amount , dp);
        
    }
}