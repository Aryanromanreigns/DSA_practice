class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        Arrays.sort(costs , (a,b) -> Integer.compare(a[1] - a[0] , b[1] - b[0]));

        int total = 0;

        for(int i = 0 ; i < n ; i++){
            if(i < n/2){
                total += costs[i][1];
            }
            else{
                total += costs[i][0];
            }
        }

        return total;
        
    }
}