class Solution {
public:
    int minPairSum(vector<int>& nums) {
        int n = nums.size();
        // int sum = 0;
        int maxi = INT_MIN;

        sort(nums.begin() , nums.end());
        int i = 0;
        int j = n-1;
        while(i < j){
            int sum = nums[i] + nums[j];
            maxi = max(maxi , sum);
            i++;
            j--;

        }
        return maxi;
        
    }
};