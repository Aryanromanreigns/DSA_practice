class Solution {
public:
    int func(vector<int>&nums , int k){
        int sum = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            sum += (nums[i] + k -1)/k;
        }
        return sum;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int n = nums.size();
        int low = 1;
        int maxi = INT_MIN;
        for(int i = 0 ; i < nums.size() ; i++){
            maxi = max(maxi , nums[i]);
        }
        int high = maxi;

        while(low <= high){
            int mid = (low + high)/2;

            if(func(nums , mid) <= threshold){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
        
    }
};