class Solution {
public:
    int evalRPN(vector<string>& s) {
        int n = s.size();
        stack<int>st;

        for(int i = 0 ; i < n ; i++){
            if(s[i] == "+" || s[i] == "-" || s[i] == "*" || s[i] == "/"){
                int two = st.top();
                st.pop();
                int one = st.top();
                st.pop();

                if(s[i] == "+"){
                    st.push(one + two);

                }
                else if(s[i] == "-"){
                    st.push(one - two);

                }
                else if(s[i] == "*"){
                    st.push(one * two);
                }
                else{
                    st.push(one / two);
                }
            }
            else{
                st.push(stoi(s[i]));
            }
        }
        return st.top();
        
    }
};