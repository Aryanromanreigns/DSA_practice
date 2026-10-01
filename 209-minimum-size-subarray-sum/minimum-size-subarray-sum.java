class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int left = 0 , right = 0 ;
        int mini = Integer.MAX_VALUE;

        while(right < n){
            sum += nums[right];
            while(left <= right && sum >= target){
                mini = Math.min(right-left+1, mini);
                sum -= nums[left];
                left++;

            }
            right++;
        }
        if(mini == Integer.MAX_VALUE){
            return 0;
        }
        return mini;
        
    }
}