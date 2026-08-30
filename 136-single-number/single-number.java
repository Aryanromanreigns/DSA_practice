class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer>mpp = new HashMap<>();
        int n = nums.length;

        for(int i = 0 ; i < nums.length; i++){
            mpp.put(nums[i] , mpp.getOrDefault(nums[i] , 0)+1);
        }  

        // for(Map.Entry<Integer , Integer>it : mpp.entrySet()){
        //     if(it.getValue() == 1){
        //         return it.getKey();
        //     }
        // }

        for(int key : mpp.keySet()){
            if(mpp.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}