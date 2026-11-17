class Solution {
    public void func(int[] nums , List<List<Integer>> ans , List<Integer>temp , boolean[] check){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = 0 ; i < nums.length ; i++){
            
            if(!check[i]){

            temp.add(nums[i]);
            
            check[i] = true;
            func(nums , ans , temp , check);

            temp.remove(temp.size() - 1);
            check[i] = false;

            }
        }

        


    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        boolean[] check = new boolean[n];

        func(nums , ans , temp , check);

        return ans;
        
    }
}