class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        int n = nums.size();
        sort(nums.begin() , nums.end());

        int i = 0;
        while(i < nums.size() && k > 0 && nums[i] < 0){
            nums[i] = -nums[i];
            i++;
            k--;
        }

        int sum = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            sum += nums[i];
        }

        if(k % 2 == 1){
            int mini = INT_MAX;
            for(int i = 0 ; i < n ; i++){
                mini = min(mini , abs(nums[i]));
            }
            sum -= 2*mini;
        }
        return sum;
        
        
    }
};