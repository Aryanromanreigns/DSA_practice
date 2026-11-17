class Solution {
    public void func(int[] candidates , int target , List<List<Integer>>ans , List<Integer>temp , int ind){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        if(ind == candidates.length)return;

        if(target >= candidates[ind]){
            temp.add(candidates[ind]);
            func(candidates , target - candidates[ind] , ans ,temp  , ind);
            temp.remove(temp.size() - 1);
        }

        func(candidates , target , ans , temp , ind+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        func(candidates , target , ans , temp , 0);

        return ans;
        
    }
}