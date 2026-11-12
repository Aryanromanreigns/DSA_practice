class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        TreeMap<String , Integer>mpp = new TreeMap<>();
        String val = "";

        for(int i = 0 ; i < n ; i++){
            char ch = s1.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                val += ch;
            }
            else{
                mpp.put(val , mpp.getOrDefault(val , 0) +1);
                val = "";
            }
        }
        mpp.put(val , mpp.getOrDefault(val , 0) +1);

        val = "";
        for(int i = 0 ; i < m ; i++){
            char ch = s2.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                val += ch;
            }
            else{
                mpp.put(val , mpp.getOrDefault(val , 0) +1);
                val = "";
            }
        }
        mpp.put(val , mpp.getOrDefault(val , 0) +1);

        int cnt = 0;

        for(String value : mpp.keySet()){
            if(mpp.get(value) == 1){
                cnt++;
            }
        }

        // int nn = mpp.size();
        String[] ans = new String[cnt];
        int ind = cnt-1;

        for(String value : mpp.keySet()){
            if(mpp.get(value) == 1){
                ans[ind] = value;
                ind--;
            }
        }

        return ans;
        
        
    }
}