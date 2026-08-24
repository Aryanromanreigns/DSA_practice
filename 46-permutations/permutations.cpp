class Solution {
public:
    vector<vector<int>>func( vector<int>&nums , 
    vector<vector<int>>&ans , vector<int>&temp , vector<int>&vis){
        if(temp.size() == nums.size()){
            ans.push_back(temp);
            return ans;
        }

        for(int i = 0 ; i < nums.size() ; i++){
            if(vis[i])continue;
            vis[i] = 1;
            temp.push_back(nums[i]);
            func(nums , ans , temp , vis);
            temp.pop_back();
            vis[i] = 0;
        }
        return ans;


    }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>>ans;
        vector<int>temp;
        vector<int>vis(nums.size() ,0);
        return func( nums , ans , temp , vis);
        
    }
};