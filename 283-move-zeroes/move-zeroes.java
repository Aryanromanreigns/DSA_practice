class Solution {
    public void moveZeroes(int[] nums) {
        int k = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                k = i ;
                break;
            }
        }
        if(k == -1)return;

        for(int i = k+1 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                nums[i] = 0;
                k++;
            }
        }
        
        
    }
}