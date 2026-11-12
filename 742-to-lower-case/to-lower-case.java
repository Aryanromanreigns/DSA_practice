class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        String ans = "";

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                ans += (char)(ch - 'A' + 'a');
            }else{
                ans += ch;
            }
        }
        return ans;
        
    }
}