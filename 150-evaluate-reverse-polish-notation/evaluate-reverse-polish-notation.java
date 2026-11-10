
class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = 0; i < n; i++){

            if(tokens[i].equals("+") || tokens[i].equals("-") ||
               tokens[i].equals("/") || tokens[i].equals("*")){

                int sec = st.peek();
                st.pop();

                int fir = st.peek();
                st.pop();

                if(tokens[i].equals("+")){
                    st.push(fir + sec);
                }
                else if(tokens[i].equals("-")){
                    st.push(fir - sec);
                }
                else if(tokens[i].equals("/")){
                    st.push(fir / sec);
                }
                else{
                    st.push(fir * sec);
                }
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        return st.peek();
    }
}
