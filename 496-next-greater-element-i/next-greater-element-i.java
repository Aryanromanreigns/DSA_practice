class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashMap<Integer , Integer>mpp = new HashMap<>();
        Deque<Integer>st = new ArrayDeque<>();

        for(int i = m-1 ; i >= 0; i--){
            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                mpp.put(nums2[i] , st.peek());
            }
            else{
                mpp.put(nums2[i] , -1);
            }

            st.push(nums2[i]);
        }
        int[] ans = new int[n];

        for(int i = 0 ; i < n ; i++){
            ans[i] = mpp.get(nums1[i]);
        }

        return ans;

        
    }
}