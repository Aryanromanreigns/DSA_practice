class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int[][] ans = new int[n][2];

        Arrays.sort(intervals ,(a,b) -> Integer.compare(a[0] , b[0]));

        int st = intervals[0][0];
        int end = intervals[0][1];

        int j = 0;

        for(int i = 1 ; i < n ; i++){
            if(end >= intervals[i][0]){
                end = Math.max(end , intervals[i][1]);
            }
            else{
                ans[j][0] = st;
                ans[j][1] = end;

                j++;
                st = intervals[i][0];
                end = intervals[i][1];

            }
        }

        ans[j][0] = st;
        ans[j][1] = end;

        return Arrays.copyOf(ans, j+1);
        
    }
}