class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        Deque<Integer>st = new ArrayDeque<>();

        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek() - i;
            }
            else{
                ans[i] = 0;
            }
            st.push(i);
        }
        return ans;
        
    }
}