class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        // int maxi = Integer.MIN_VALUE;
        double sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        double maxi = sum;
        int left = 0;
        int right = k;
        while(right < n){
            sum += nums[right];
            sum -= nums[left];
            left++;
            right++;
            maxi = Math.max(maxi , sum);
        }

        return maxi/k;
        
    }
}