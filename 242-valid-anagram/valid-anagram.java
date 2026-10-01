class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        HashMap<Character , Integer>mpp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            mpp.put(s.charAt(i) , mpp.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i = 0 ; i < m ; i++){
            if(!mpp.containsKey(t.charAt(i))){
                return false;
            }
            mpp.put(t.charAt(i) , mpp.get(t.charAt(i))-1);

            if(mpp.get(t.charAt(i))== 0){
                mpp.remove(t.charAt(i));
            }

        }

        if(mpp.isEmpty()){
            return true;
        }
        else{
            return false;
        }


        
    }
}