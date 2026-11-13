class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int n = sentence.length();
        LinkedHashMap<String , Integer> mpp = new LinkedHashMap<>();
        String val = "";
        int cnt = 1;

        for(int i = 0; i < n ; i++){
            char ch = sentence.charAt(i);
            if(ch == ' '){
                mpp.putIfAbsent(val, cnt);
                cnt++;
                val = "";
            }
            else{
                val += ch;
            }
        }        
        mpp.putIfAbsent(val, cnt);
        int nn = searchWord.length();

        for(String value : mpp.keySet()){
            String word = value;
            int i = 0;

            while(i < nn && i < word.length()){
                if(searchWord.charAt(i) == word.charAt(i)){
                    i++;
                }
                else{   
                    break;
                }
            }
            if(i == nn){
                return mpp.get(word);
            }
            
        }
        return -1;
    }
}