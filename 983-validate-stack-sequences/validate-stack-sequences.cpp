class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        int n = pushed.size();
        int m = popped.size();
        stack<int>st;

        int i = 0 , j = 0;
        while(i < n){
            st.push(pushed[i]);
            i++;


            while(!st.empty() && j < m && st.top() == popped[j]){
                st.pop();
                j++;
            }
        }


        if(st.empty())return true;
        else{
            return false;
        }
        
    }
};