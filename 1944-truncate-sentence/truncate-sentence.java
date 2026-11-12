class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();

        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            if(k > 0){
                if(s.charAt(i) == ' '){
                    if(k > 1)
                    ans.append(' ');
                    k--;
                }
                else{
                    ans.append(s.charAt(i));
                }
            }
            else{
                break;
            }
        }
        return ans.toString();
        
    }
}