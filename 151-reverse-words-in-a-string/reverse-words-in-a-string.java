class Solution {
    public String reverseWords(String s) {
        Deque<String>st = new ArrayDeque<>();

        String val = "";

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(!val.isEmpty())
                st.push(val);
                val = "";
            }
            else{
                val += ch;
            }
        }
        if(!val.isEmpty())
        st.push(val);

        String ans = "";
        while(!st.isEmpty()){
            ans += st.peek() + " ";
            st.pop();
        }
        return ans.trim();
        
    }
}