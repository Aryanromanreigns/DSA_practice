class Solution {
public:
    vector<int> findKDistantIndices(vector<int>& nums, int key, int k) {
        int n = nums.size();
        vector<int>ind;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == key){
                ind.push_back(i);
            }
        }
        vector<int>ans;

        int i = 0 ; 

        while(i < n){
            int j = 0;
            while(j < ind.size() && abs(i - ind[j]) > k ){
                j++;
            }
            if(j < ind.size() && abs(i - ind[j]) <= k ){
                ans.push_back(i);
            }
            i++;
        }
        return ans;
        
    }
};