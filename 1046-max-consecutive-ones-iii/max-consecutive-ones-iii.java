class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxi = 0;
        int sum = 0;
        int low = 0 , high = 0;

        while(high < n){
            while(low <= high && k == 0 && nums[high] == 0){
                sum--;
                if(nums[low] == 0)k++;
                low++;
            }
            if(nums[high] == 0 && k > 0){
                k--;
            }
            sum++;
            maxi = Math.max(maxi , sum);
            high++;
        }
        return maxi;
        
    }
}