class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m)return false;

        HashMap<Character , Integer>mpp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            mpp.put(ch , mpp.getOrDefault(ch , 0)+1);
        }

        for(int i = 0 ; i < m ; i++){
            char ch = t.charAt(i);
            if(mpp.containsKey(ch)){
                mpp.put(ch , mpp.get(ch)-1);
            

            if(mpp.get(ch) == 0){
                mpp.remove(ch);
            }

            }
            else{
                return false;
            }
        }
        return true;
        
    }
}