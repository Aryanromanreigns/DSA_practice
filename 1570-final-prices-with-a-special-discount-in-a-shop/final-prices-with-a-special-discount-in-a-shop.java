class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;

        int[] ans = new int[n];
        Deque<Integer>st = new ArrayDeque<>();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && prices[i] < st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = prices[i] - st.peek();
            }
            else{
                ans[i] = prices[i];
            }

            st.push(prices[i]);
        }

        return ans;
        
    }
}