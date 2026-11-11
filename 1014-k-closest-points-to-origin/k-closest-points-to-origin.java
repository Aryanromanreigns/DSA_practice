class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        //now declare the max heap with {dist, {r,c}}
        PriorityQueue<int[] >pq = new PriorityQueue<>(
            (a,b)-> Integer.compare(b[0] , a[0])
        );

        //now find dist and put it with row and col
        for(int i = 0 ; i < n ; i++){
            int x = points[i][0];
            int y = points[i][1];

            int dist = x*x + y*y;

            pq.offer(new int[] {dist , x , y});

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];
    
        //now traverse over the pq so that we can add element the to the answeer
        int i = 0;
        while(!pq.isEmpty()){
            ans[i][0] = pq.peek()[1];
            ans[i][1] = pq.peek()[2];
            pq.poll();
            i++;                    
        }
        return ans;
        
    }
}