class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Deque<Integer>st = new ArrayDeque<>();
        int[] pse = new int[n];
        int[] nse = new int[n];

        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                pse[i] = st.peek();
            }
            else{
                pse[i] = -1;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }

        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                nse[i] = st.peek();
            }
            else{
                nse[i] = n;
            }

            st.push(i);
        }


        long mod = 1000000007L;
        long total = 0;

        for(int i = 0 ; i < n ; i++){
            int left = i - pse[i];
            int right = nse[i] - i;

            total = (total + (1L * arr[i] * left * right )%mod)%mod;
        }
        return (int)total;
        
    }
}