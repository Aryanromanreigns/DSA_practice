class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.append(Character.toLowerCase(ch));
            }
        }

        int i = 0;
        int si = ans.length()-1;

        while(i < si){
            if(ans.charAt(i) != ans.charAt(si)){
                return false;
            }
            i++;
            si--;
        }
        return true;

        
    }
}