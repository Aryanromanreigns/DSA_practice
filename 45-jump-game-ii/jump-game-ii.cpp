class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int left = 0;
        int right = 0;
        int cnt = 0;
        while(right < n-1){
            int farthest = 0;
            for(int i = left ; i <= right ; i++){
                farthest = max(farthest , i + nums[i]);
            }
            cnt++;
            left = right+1;
            right = farthest;;
        }
        return cnt;
        
    }
};