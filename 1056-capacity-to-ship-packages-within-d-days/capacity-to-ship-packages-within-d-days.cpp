class Solution {
public:
    int func(vector<int>&nums , int cap){
        int sum = 0;
        int cnt = 1;
        for(int i = 0 ; i < nums.size(); i++){
            if(sum + nums[i] <= cap){
                sum += nums[i];
            }
            else{
                cnt++;
                sum = nums[i];
            }
        }
        return cnt;
    }
    int shipWithinDays(vector<int>& weights, int days) {
        int n = weights.size();
        int sum = 0;
        int maxi = INT_MIN;

        for(int i = 0 ; i < n ; i++){
            sum += weights[i];
            maxi = max(maxi , weights[i]);
        }

        int low = maxi;
        int high = sum;

        while(low <= high){
            int mid = (low + high)/2;
            
            if(func(weights , mid ) <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
        
    }
};