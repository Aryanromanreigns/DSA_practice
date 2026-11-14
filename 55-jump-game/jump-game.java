class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        if(n == 1 ){
            return true;
        }

        if(nums[0] == 0){
            return false;
        }

        int ind = 0;
        for(int i = 0 ; i < n-1 ; i++){
            if(ind < i){
                return false;
            }
            ind = Math.max(ind , nums[i]+i);
            if(ind >= n-1){
                return true;
            }
        }

        return false;
        
    }
}