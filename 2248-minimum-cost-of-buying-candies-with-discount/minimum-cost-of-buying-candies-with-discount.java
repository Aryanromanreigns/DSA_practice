class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        
        int total = 0;
        int cnt = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            if(cnt == 2){
                cnt = 0;

            }   
            else{
                total += cost[i];
                cnt++;
            }         
        }
        return total;

        
    }
}