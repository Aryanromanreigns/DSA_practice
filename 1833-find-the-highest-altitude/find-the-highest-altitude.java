class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        // int[] ans = new int[n+1];

        // ans[0] = 0;
        int maxi = 0;
        int last = 0;
        for(int i = 0 ; i < n ; i++){            
            maxi = Math.max(maxi , last + gain[i]);
            last = last + gain[i];
        }

        return maxi;
        
    }
}