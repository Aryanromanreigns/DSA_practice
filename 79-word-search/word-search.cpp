class Solution {
public:
    bool func(vector<vector<char>>&board , string& word , vector<vector<int>>&vis , int r,
            int c , int ind){
                int n = board.size();
                int m = board[0].size();
                if(ind == word.size()){
                    return true;
                }
                if(r < 0 || c < 0 || r >= n || c >= m){
                    return false;
                }

                if(vis[r][c] == 1){
                    return false;
                }

                if(board[r][c] != word[ind]){
                    return false;
                }

                vis[r][c] = 1;
                int drow[] = {-1,0,1,0};
                int dcol[] = {0,1,0,-1};

                for(int i = 0 ; i < 4 ; i++){
                    int nrow = r + drow[i];
                    int ncol = c + dcol[i];

                    if(func(board , word , vis , nrow , ncol , ind+1)){
                        return true;
                    }
                }


                vis[r][c] = 0;

                return false;






            }
    bool exist(vector<vector<char>>& board, string word) {
        int n = board.size();
        int m = board[0].size();
        vector<vector<int>>vis(n , vector<int>(m , 0));

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(func(board , word , vis , i , j ,0)){
                    return true;
                }
            }
        }
        return false;
        
        
    }
};