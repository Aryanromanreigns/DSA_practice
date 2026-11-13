class Solution {
    public String arrangeWords(String text) {
        text = text.toLowerCase();
        int n = text.length();
        TreeMap<Integer , List<String>>mpp = new TreeMap<>();

        String val = "";
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            char ch = text.charAt(i);
            if(ch == ' '){
                mpp.putIfAbsent(cnt , new ArrayList<>());
                mpp.get(cnt).add(val);
                val = "";
                cnt = 0;
            }else{
                val += ch;
                cnt++;
            }
        }

        mpp.putIfAbsent(cnt , new ArrayList<>());
        mpp.get(cnt).add(val);
        String ans = "";
        for(List<String> words : mpp.values()){
            for(String word : words){
                ans += word + " ";
            }
        }
        ans =  ans.trim();

        ans = Character.toUpperCase(ans.charAt(0)) + ans.substring(1);

        return ans;

        
    }
}