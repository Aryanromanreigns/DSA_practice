class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        //mpp decleare
        TreeMap<Integer , Integer> mpp = new TreeMap<>();

        //store value in mpp with value and count
        for(int i = 0 ; i < n ; i++){
            mpp.put(nums[i] , mpp.getOrDefault(nums[i],0)+1);
        }

        //now decleare pq accroding to requrimnet
        PriorityQueue<int[] >pq = new PriorityQueue<>(
            (a,b)->{
                if(a[1] == b[1]){
                    return Integer.compare(b[0] , a[0]);
                }
                return Integer.compare(b[1] , a[1]);
            }
        );

        //now put the pair value in pq
        for(int key : mpp.keySet()){
            int value = mpp.get(key);
            pq.offer(new int[]{key , value});
        }

        //now traverse in pq so that we can take top k element 
        int ind = 0;
        int[] ans = new int[k];

        while(k > 0){
            ans[ind] = pq.peek()[0];
            pq.poll();

            ind++;
            k--;
        }
        return ans;


        
    }
}