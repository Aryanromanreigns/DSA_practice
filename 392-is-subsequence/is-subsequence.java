class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m  = t.length();

        int i = 0 ; 
        int j = 0;

        while(i < n && j < m){
            char ch  = s.charAt(i);
            char c = t.charAt(j);

            if(ch == c){
                i++;
            }
            j++;
        }
        if(i == n)return true;
        return false;
        
    }
}