class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m)return false;

        HashMap<Character , Integer>mpp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            mpp.put(s.charAt(i) , mpp.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i = 0 ; i < m ; i++){
            if(mpp.containsKey(t.charAt(i))){
                mpp.put(t.charAt(i) , mpp.get(t.charAt(i))-1);


                if(mpp.get(t.charAt(i)) == 0){
                    mpp.remove(t.charAt(i));
                }

            }else{
                return false;
            }
        }
        return true;

        
    }
}