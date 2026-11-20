class Solution {
    public int func(int n , int ind , int[] dp){
        if(ind == n){
            return 1;
        }
        if(ind > n){
            return 0;
        }

        if(dp[ind] != -1){
            return dp[ind];
        }

        int one = func(n , ind+1 , dp);
        int two = func(n , ind+2 , dp);

        return dp[ind] = one + two;


        
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return func(n , 0 , dp);
        
    }
}