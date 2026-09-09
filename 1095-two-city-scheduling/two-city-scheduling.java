class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int sum = 0;
        
        Arrays.sort(costs ,(a , b) -> {
            return Integer.compare(a[1] - a[0], b[1] - b[0]);
        });

        for(int i = 0 ; i < n ; i++){
            if(i < n/2){
                sum += costs[i][1];
            }
            else{
                sum += costs[i][0];
            }
        }
        return sum;
        
    }
}