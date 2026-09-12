class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int n = customers.length;

        for(int i = 0 ; i < n ; i++){
            if(grumpy[i] == 0){
                sum += customers[i];
            }
        }
        int low = 0;
        int extra = 0;
        for(int i = 0 ; i < minutes ; i++){
            if(grumpy[i] == 1){
                sum += customers[i];
            }
        }
        int maxi = sum;
        for(int high = minutes ; high < n ; high++){
            if(grumpy[high] == 1){
                sum += customers[high];
            }
            if(grumpy[low] == 1){
                sum -= customers[low];
            }
            low++;
            maxi = Math.max(maxi , sum);

        }
        return maxi;
        
    }
}