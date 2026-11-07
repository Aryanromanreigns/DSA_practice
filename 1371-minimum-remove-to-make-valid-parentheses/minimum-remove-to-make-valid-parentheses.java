class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();

        Deque<Integer>st = new ArrayDeque<>();
        char[] array = s.toCharArray();

        for(int i = 0 ; i < n ; i++){
            char ch = array[i];
            if(ch == '('){
                st.push(i);
            }
            else if(ch == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    array[i] = '#';
                }
            }
        }

        while(!st.isEmpty()){
            int ind = st.peek();
            array[ind] = '#';
            st.pop();
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            if(array[i] != '#'){
                ans.append(array[i]);
            }
        }

        return ans.toString();
        
    }
}