class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Deque<Character>st = new ArrayDeque<>();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        int nn = st.size()-1;
        String ans = "";
        int i = 0;

        while(!st.isEmpty()){
            ans += st.peek();
            st.pop();
        }

        String res = "";
        while(nn >= 0){
            res += ans.charAt(nn);
            nn--;
        }
        

        return res;

        
    }
}