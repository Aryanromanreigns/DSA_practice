class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        //max heap so that top two element we can always compare
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        //now put the value in the pq;
        for(int i = 0 ; i < n ; i++){
            pq.offer(stones[i]);
        }

        //now take and sub and then put the value in the pq until the sise becomes one
        while(pq.size() > 1){
            int first = pq.peek();
            pq.poll();

            int second = pq.peek();
            pq.poll();

            int val = Math.abs(first - second);
            pq.offer(val);
        }

        return pq.peek();
        
    }
}