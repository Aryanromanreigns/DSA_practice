class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.toLowerCase();
        int n = s.length();

        TreeMap<String , Integer>mpp = new TreeMap<>();
        String val = "";

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                val += ch;
            }
            else{
                if (!val.isEmpty()) {
                    mpp.put(val, mpp.getOrDefault(val, 0) + 1);
                }
                val = "";
            }
        }

        if (!val.isEmpty()) {
            mpp.put(val, mpp.getOrDefault(val, 0) + 1);
        }

        int maxi = 0;
        String ans = "";

        for(String value : mpp.keySet()){
            boolean check = false;

            for(int i = 0 ; i < banned.length; i++){
                if(value.equals(banned[i])){
                    check = true;
                    break;
                }
            }

            if(!check && mpp.get(value) > maxi){
                maxi = mpp.get(value);
                ans = value;
            }

        }

        return ans;
        

        
        
    }
}