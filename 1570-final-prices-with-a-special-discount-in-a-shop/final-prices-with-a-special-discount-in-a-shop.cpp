class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        int n = prices.size();
        stack<int>st;

        vector<int>arr;
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.empty() && prices[i] < st.top()){
                st.pop();
            }
            if(st.empty()){
                arr.push_back(0);
            }
            else{
                arr.push_back(st.top());
            }

            st.push(prices[i]);
        }
        reverse(arr.begin() , arr.end());
        vector<int>ans;
        int i = 0;
        int j = 0;

        for(j = 0 ; j < n ; j++){
            ans.push_back(prices[j] - arr[j]);
            
        }
        return ans;
        
    }
};