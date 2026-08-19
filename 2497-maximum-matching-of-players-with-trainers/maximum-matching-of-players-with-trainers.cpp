class Solution {
public:
    int matchPlayersAndTrainers(vector<int>& arr, vector<int>& nums) {
        int n = arr.size();
        int m = nums.size();

        sort(arr.begin() , arr.end());
        sort(nums.begin() , nums.end());

        int cnt = 0;
        int i = 0 , j = 0;

        while(i < n && j < m){
            if(arr[i] <= nums[j]){
                cnt++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return cnt;
        
    }
};