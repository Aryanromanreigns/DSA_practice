class Solution {
public:
    int func(int n , int ind , vector<int>&dp){
        if(ind == n)return 1;
        if(ind > n)return 0;
        if(dp[ind] != -1)return dp[ind];
        int one = func(n , ind+1 , dp);
        int two = func(n , ind + 2 , dp);

        return dp[ind] = one + two;
    }
    int climbStairs(int n) {
        vector<int>dp(n+1 , -1);
        return func(n , 0 , dp);
        
    }
};