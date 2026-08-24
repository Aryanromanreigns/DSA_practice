class Solution {
public:
    vector<vector<int>>func(vector<int>& candidates , int k , int ind  , vector<vector<int>>&ans , vector<int>&temp){
        if(ind == candidates.size()){
            if(k == 0){
                ans.push_back(temp);
            }
            return ans;
        }
        
        if(candidates[ind] <= k){
            temp.push_back(candidates[ind]);
            func(candidates , k-candidates[ind] , ind , ans , temp);
            temp.pop_back();
        }
        func(candidates , k , ind+1 , ans , temp);

        return ans;

    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>>ans;
        vector<int>temp;
        return func(candidates , target , 0 , ans  , temp);
        
    }
};