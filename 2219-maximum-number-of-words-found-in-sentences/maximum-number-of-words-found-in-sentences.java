class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        // int cnt = 0;
        int maxi = 0;

        for(int i = 0 ; i < n ; i++){
            String s = sentences[i];
            int cnt = 1;

            for(int j = 0 ; j < s.length() ; j++){
                if(s.charAt(j) == ' '){
                    cnt++;
                }
            }
            maxi = Math.max(maxi , cnt);
        }

        return maxi;

        
    }
}