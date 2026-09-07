class Solution {
    public boolean canJump(int[] nums) {
        int maxi = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(maxi < i){
                return false;
            }
            maxi = Math.max(maxi , i+nums[i]);
        }
        return true;
        
    }
}