class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int n = customers.length;
        int extra = 0;

        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0){
                sum += customers[i];
            }
        }

        if(minutes == 0) return sum;

        int low = 0;
        int maxi = sum;
        int req = minutes;

        for(int i = 0; i < n; i++){

            // Remove the left element if window is full
            while(low < i && req == 0){
                if(grumpy[low] == 1){
                    extra -= customers[low];
                }
                req++;
                low++;
            }

            // Add current element
            if(grumpy[i] == 1 && req > 0){
                extra += customers[i];
            }

            req--;

            maxi = Math.max(maxi, sum + extra);
        }

        return maxi;
    }
}