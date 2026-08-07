class Solution {
public:
    string removeDuplicateLetters(string s) {
        int n = s.size();
        vector<int>last(26);
        vector<bool >visited(26 , false);
        stack<char>st;

        for(int i = 0 ; i < n ; i++){
            last[s[i] - 'a'] =i;
        }

        for(int i = 0 ; i < n ; i++){
            if(visited[s[i] - 'a'])continue;

            while(!st.empty() && st.top() > s[i] && last[st.top() - 'a'] > i){
                visited[st.top() - 'a'] = false;
                st.pop();
            }

            st.push(s[i]);
            visited[s[i] - 'a'] = true;
        }

        string ans;
        while(!st.empty()){
            ans += st.top();
            st.pop();
        }

        reverse(ans.begin() , ans.end());
        return ans;

        
    }
};