class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        int cnt = 0;
        int maxi = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] == '('){
                cnt++;

                if(cnt > maxi){
                    maxi = cnt;
                }
            }
            else if(arr[i] == ')'){
                cnt--;
            }
        }
        return maxi;
        
    }
}