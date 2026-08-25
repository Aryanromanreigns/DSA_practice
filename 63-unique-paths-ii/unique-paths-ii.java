class Solution {
    static int func(int[][] arr , int i , int j , int[][] dp){
        int n = arr.length;
        int m = arr[0].length;

        if(i == n-1 && j == m-1 && arr[i][j] != 1){
            return 1;
        }
        if(i < 0 || j < 0 || i >= n || j >= m){
            return 0;
        }

        if(arr[i][j] == 1)return 0;

        if(dp[i][j] != -1)return dp[i][j];


        int right = func(arr , i , j+1 ,dp);
        int left = func(arr , i+1 , j , dp);

        return dp[i][j] = left + right;



    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(dp[i],-1);
        }
        return func(arr , 0 , 0 ,dp);
        
    }
}