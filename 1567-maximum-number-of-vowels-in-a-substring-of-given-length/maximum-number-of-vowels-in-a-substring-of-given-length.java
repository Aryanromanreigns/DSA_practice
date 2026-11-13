class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxi = 0;
        int cnt = 0;

        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                cnt++;
            }
        }
        maxi = cnt;

        int low = 0;
        int high = k;

        while(high < n){
            char ch = s.charAt(high);
            char c = s.charAt(low);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt--;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){                
                cnt++;
            }
            maxi = Math.max(maxi , cnt);

            low++;
            high++;
        }

        return maxi;

            
    

        

        
        
    }
}