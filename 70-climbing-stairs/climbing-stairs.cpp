class Solution {
public:
    int func(int n , int ind , vector<int>&dp ){
        if(ind == n){
            return 1;
        }
        if(ind > n){
            return 0;
        }

        if(dp[ind] != -1)return dp[ind];


        int chone = func(n , ind+1 , dp);
        int chtwo = func(n , ind+2 , dp);
        return dp[ind] = chone + chtwo;
    }

    int climbStairs(int n) {
        vector<int>dp(n+1,-1);
        return func(n ,0 , dp);
        
    }
};