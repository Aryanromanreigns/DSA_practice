class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        String ans = "";

        for(int i = 0 ; i < n ; i++){
            ans += Character.toLowerCase(s.charAt(i));
        }
        return ans;
        
    }
}