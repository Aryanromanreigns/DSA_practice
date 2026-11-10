class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Deque<Integer>st = new ArrayDeque<>();
        int[] ans = new int[n];

        for(int i = 2*n-1 ; i >= 0 ; i--){
            if(i < n){
            while(!st.isEmpty() && nums[i%n] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            }

            st.push(nums[i%n]);
        }
        return ans;
        
    }
}