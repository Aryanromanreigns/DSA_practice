class Solution {
    public void func(StringBuilder ans , int k , int last){
        while(k < last){
            char temp = ans.charAt(k);
            ans.setCharAt(k , ans.charAt(last));
            ans.setCharAt(last , temp);

            k++;
            last--;
        }

    }
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int k = 0;
        // int last = 0;

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                int last = ans.length()-1;
                func(ans , k , last);
                ans.append(' ');
                k = i+1;
            
            }
            else{
                ans.append(ch);
            }
        }
        func(ans , k , ans.length()-1);
        return ans.toString();
        
    }
}