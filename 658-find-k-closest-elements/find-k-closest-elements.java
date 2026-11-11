class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        PriorityQueue<int[]>pq = new PriorityQueue<>(
            (a,b)->{
                if(a[1] == b[1]){
                    return Integer.compare(b[0] , a[0]);
                }
                return Integer.compare(b[1],a[1]);
            }
        );

        for(int i = 0 ; i < n ; i++){
            int val = Math.abs(arr[i] - x);
            pq.offer(new int[]{arr[i] , val});

            if(pq.size() > k){
                pq.poll();
            }
        }

        // int[] ans = new int[k];
        ArrayList<Integer>ans = new ArrayList<>();
        int i = 0;
        while(!pq.isEmpty()){
            int val = pq.peek()[0];
            ans.add(val);
            pq.poll();
        }

        Collections.sort(ans);

        return ans;
        
    }
}