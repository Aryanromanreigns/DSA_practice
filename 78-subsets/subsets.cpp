class Solution {
public:
    vector<vector<int>>func(int ind  , vector<int>&nums , 
    vector<vector<int>>&ans , vector<int>&temp){
        if(ind == nums.size()){
            ans.push_back(temp);
            return ans;
        }
        temp.push_back(nums[ind]);
        func(ind + 1 , nums , ans ,temp);
        temp.pop_back();
        func(ind + 1 , nums , ans , temp);

        return ans;

    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>>ans;
        vector<int>temp;
        return func(0 , nums , ans , temp);
    }
};