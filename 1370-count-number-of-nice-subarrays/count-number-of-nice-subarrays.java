class Solution {
    public int func(int[] nums , int k){
        int sum = 0;
        int n = nums.length;
        int low = 0;
        int high = 0;
        int cnt = 0;

        while(high < n){
            if(nums[high] % 2 != 0)k--;
            while(low <= high && k < 0){
                if(nums[low] % 2 != 0)k++;
                low++;
            }
            cnt += high - low + 1;
            high++;
            
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return func(nums , k) - func(nums , k-1);
        
    }
}