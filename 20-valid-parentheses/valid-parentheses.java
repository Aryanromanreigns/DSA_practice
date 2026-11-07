class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Deque<Character>st = new ArrayDeque<>();

        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty())return false;                
                if(s.charAt(i) == ')' && st.peek() != '(')return false;
                if(s.charAt(i) == '}' && st.peek() != '{')return false;
                if(s.charAt(i) == ']' && st.peek() != '[')return false;

                st.pop();
            }
        }
        return st.isEmpty();
        
    }
}