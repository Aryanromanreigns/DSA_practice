class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = profit.length;
        int[][] arr = new int [n][2];

        for(int i = 0 ; i < n ; i++){
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }

        Arrays.sort(arr , (a , b) ->{
            if(a[0] == b[0]){
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        Arrays.sort(worker);

        int lastmax = 0;
        int sum = 0;
        int i = 0 , j = 0;
        while( j< worker.length ){
            if(i < n && arr[i][0] <= worker[j]){
                if(lastmax < arr[i][1]){
                    lastmax = arr[i][1];

                }
                i++;
            }
            else{
                sum += lastmax;
                j++;
            }
        }
        return sum;


        
    }
}