class Solution {
public:
    int func(vector<vector<int>>&grid , vector<vector<int>>&vis , int r,
            int c , vector<vector<int>>&dp){
                int n = grid.size();
                int m = grid[0].size();
                if(r >= n || r < 0 || c >= m || c < 0){
                    return 0;
                }

                if(vis[r][c] == 1)return 0;

                if(grid[r][c] == 1)return 0;

                if(r == n-1 && c == m-1){
                    return 1;
                }

                if(dp[r][c] != -1)return dp[r][c];

                vis[r][c] = 1;
                int drow[] = { 0 , +1 };
                int dcol[] = { +1 , 0 , };

                int ans = 0;

                for(int i = 0 ; i < 2 ; i++){
                    int nrow = r + drow[i];
                    int ncol = c + dcol[i];

                    ans += func(grid , vis , nrow , ncol ,dp);                     
                }

                vis[r][c] = 0;
                return dp[r][c] = ans;
            }
    int uniquePathsWithObstacles(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>>dp(n , vector<int>(m , -1));

        vector<vector<int>>vis(n , vector<int>(m , 0));


        return func(grid , vis , 0 ,0 ,dp);
     
        
    }
};