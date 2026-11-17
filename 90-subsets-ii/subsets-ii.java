class Solution {
    public void func(int[] nums , List<List<Integer>>ans , List<Integer>temp , int ind){

        ans.add(new ArrayList<>(temp));

        for(int i = ind ; i < nums.length ; i++){
            if(i > ind && nums[i] == nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            func(nums , ans , temp , i + 1);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();

        func(nums , ans , temp , 0);
        return ans;
        
    }
}