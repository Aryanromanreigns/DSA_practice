class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        double maxi = sum;
        int low = 0;
        for(int i = k ; i < n ; i++){
            sum -= nums[low];
            sum += nums[i];
            low++;

            maxi = Math.max(maxi , sum);            
        }
        return maxi/k;
        
    }
}