class Solution {
    public String interpret(String command) {
        Deque<Character>st = new ArrayDeque<>();
        int n = command.length();

        for(int i = 0; i < n ; i++){
            char ch = command.charAt(i);
            if(!st.isEmpty() && st.peek() == '(' && ch == ')'){
                st.pop();
                st.push('o');
            }
            else if(!st.isEmpty() && st.peek() == '(' && ch != ')'){
                st.pop();
                st.push(ch);
            }else if(ch != ')'){
                st.push(ch);
            }
        }

        

        int nn = st.size();
        char[] ans = new char[nn];
        int ind = nn-1;

        while(!st.isEmpty()){
            ans[ind] = st.peek();
            st.pop();
            ind--;
        }

        return new String(ans);
        
    }
}