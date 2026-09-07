class Solution {
    public int maximumUnits(int[][] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr , (a , b) -> {
            if(a[1] == b[1]){
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i][0] <= k){
                cnt += arr[i][0] * arr[i][1];
                k -= arr[i][0];                
            }
            else{
                cnt += k * arr[i][1];
                k = 0;
            }
            if(k == 0)break;
        }
        return cnt;


        
    }
}