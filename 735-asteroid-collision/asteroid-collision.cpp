class Solution {
public:
    vector<int> asteroidCollision(vector<int>& arr) {
        int n = arr.size();
        stack<int>st;
        for(int i = 0; i < n ;i++){
            if(arr[i] > 0) st.push(arr[i]);
            else{
                while(!st.empty() && st.top() > 0 && st.top() < abs(arr[i])){
                st.pop();
            }
            if(!st.empty() && st.top() == abs(arr[i])){
                st.pop();
            }
            else if(st.empty() || st.top() < 0){
                st.push(arr[i]);
            }
            }
        }
         vector<int> ans(st.size());
        for(int i = st.size() - 1; i >= 0; i--){
            ans[i] = st.top();
            st.pop();
        }

        return ans;
        
    }
};