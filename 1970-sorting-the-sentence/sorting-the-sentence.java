class Solution {
    public String sortSentence(String s) {
        int n = s.length();
        TreeMap<Integer , String> mpp = new TreeMap<>();

        String val = "";
        int digit = -1;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122){
                val += ch;
            }
            else if(ch >= '0' && ch <= '9'){
                digit = Character.getNumericValue(ch);

            }
            else{
                mpp.put(digit , val);
                val = "";
            }
        }
        mpp.put(digit , val);

        int nn = mpp.size();
        String ans = "";

        int ind = nn-1;

        for(int key : mpp.keySet()){
            String value = mpp.get(key);
            ans += value + " ";

        }
        return ans.trim();
        
    }
}